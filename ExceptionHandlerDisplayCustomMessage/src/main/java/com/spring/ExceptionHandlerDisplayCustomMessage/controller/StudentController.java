package com.spring.ExceptionHandlerDisplayCustomMessage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	@GetMapping
	public String getStudent()
	{
		String student = null;
		int len = student.length();
		return "getStudent() was called"; 
	}
}
