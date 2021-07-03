package com.spring.JpaInsertOperation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JpaInsertOperation.Model.StudentModel;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@PostMapping
	public ResponseEntity<String> createuser(@RequestBody StudentModel studentObj)
	{
		return new ResponseEntity<String>("Student created successfully",HttpStatus.OK);
		
	}
}
