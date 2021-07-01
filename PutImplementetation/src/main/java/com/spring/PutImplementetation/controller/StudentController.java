package com.spring.PutImplementetation.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@PutMapping(path="/{studentId}")
	public String updateStudent(@PathVariable String studentId)
	{
		return "updateStudent() was called with studentId = " + studentId;
	}
}
