package com.spring.JpaInsertOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JpaInsertOperation.Model.StudentModel;
import com.spring.JpaInsertOperation.serviceImpl.StudentServices;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentServices studentServiceObj;
	@PostMapping
	public ResponseEntity<String> createuser(@RequestBody StudentModel studentObj)
	{
		Boolean bRet = studentServiceObj.createStudent(studentObj);
		if(bRet==true)
		{
			return new ResponseEntity<String>("Student created successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Unable to create student",HttpStatus.BAD_REQUEST);
		}
	}
}
