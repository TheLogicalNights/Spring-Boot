package com.spring.GetHandlerReadingQueryStringRequestParameters.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student 
{
	@GetMapping
	public String getStudents(@RequestParam(value="studentId" , defaultValue = "1") int studentId)
    {
        return "getStudents() was called with studentId = " + studentId;
    }
}
