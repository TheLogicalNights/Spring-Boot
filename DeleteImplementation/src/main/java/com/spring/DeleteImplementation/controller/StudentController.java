package com.spring.DeleteImplementation.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@DeleteMapping(path="/{studentId}")
	public String deleteStudent(@PathVariable String studentId)
	{
		return "deleteStudent() was called with studentId = " + studentId;
	}
}
