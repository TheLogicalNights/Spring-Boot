package com.spring.PostImplementation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	@PostMapping
	public String createStudent()
	{
		return "createStudent() was called";
	}
}
