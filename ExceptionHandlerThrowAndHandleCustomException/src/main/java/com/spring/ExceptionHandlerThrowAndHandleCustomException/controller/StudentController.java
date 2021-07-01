package com.spring.ExceptionHandlerThrowAndHandleCustomException.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ExceptionHandlerThrowAndHandleCustomException.exception.UserException;

@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping
	public String getStudent()
	{
		if(true)
		{
			throw new UserException("User defined exception was thrown");  
		}
		return "getStudent() was called";
	}
}
