package com.spring.GetHandlerReadingPathVariable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student {
	@GetMapping(path="/{studentId}")
	public String getStudents(@PathVariable String studentId)
	{
		return "getStudent() called with studentId = " + studentId; 
	}
}
