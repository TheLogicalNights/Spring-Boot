package com.spring.PostHandlerValidationOfPostRequestBody.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.PostHandlerValidationOfPostRequestBody.Model.StudentModel;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
							 MediaType.APPLICATION_XML_VALUE},
				 produces = {MediaType.APPLICATION_JSON_VALUE,
						  	 MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<StudentModel> createUser(@Valid @RequestBody StudentModel studentobj)
	{
		return new ResponseEntity<StudentModel>(studentobj,HttpStatus.OK);
	}
}
