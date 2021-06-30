package com.spring.GetImplementation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student 
{
	@GetMapping
	public String getStudents()
	{
		return "getStudents() was called";
	}
}
