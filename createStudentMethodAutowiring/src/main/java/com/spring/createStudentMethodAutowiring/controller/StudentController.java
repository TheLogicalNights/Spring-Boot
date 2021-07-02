package com.spring.createStudentMethodAutowiring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.createStudentMethodAutowiring.model.StudentModel;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	Map<String, StudentModel> student;
	@GetMapping(path="/{studentId}")
	public ResponseEntity<StudentModel> getStudent(@PathVariable String studentId)
	{
		if(student.containsKey(studentId))
		{
			return new ResponseEntity<StudentModel>(student.get(studentId),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
							 MediaType.APPLICATION_XML_VALUE},
			    produces = {MediaType.APPLICATION_JSON_VALUE,
			    		MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> createStudent(@Valid @RequestBody StudentModel studentObj)
	{
		StudentModel returnValue = new StudentModel();
		returnValue.setRollNumber(studentObj.getRollNumber());
		returnValue.setFirstName(studentObj.getFirstName());
		returnValue.setLastName(studentObj.getLastName());
		returnValue.setEmail(studentObj.getEmail());
		
		if(student==null)
		{
			student = new HashMap<>();
		}
		student.put(returnValue.getRollNumber(), returnValue);
		return new ResponseEntity<String>("Student created successfully...",HttpStatus.OK);
	}
}
