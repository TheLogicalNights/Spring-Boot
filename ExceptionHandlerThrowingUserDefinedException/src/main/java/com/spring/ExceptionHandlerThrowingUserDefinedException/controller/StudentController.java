package com.spring.ExceptionHandlerThrowingUserDefinedException.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ExceptionHandlerThrowingUserDefinedException.exception.UserException;

@RestController
@RequestMapping("/students")
public class StudentController {
	@GetMapping
	public String getStudent()
	{
		if(true)
		{
			throw new UserException("User exception was thrown");
		}
		return "getStudent() was called";
	}
}
