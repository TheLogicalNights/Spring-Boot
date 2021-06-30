package com.spring.GetHandlerReturningJavaObj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.GetHandlerReturningJavaObj.model.StudentModel;

@RestController
@RequestMapping("/student")
public class StudenController 
{
	@GetMapping(path="/{studentId}")
	public StudentModel getStudent(@PathVariable String studentId)
	{
		StudentModel studentobj = new StudentModel();
		studentobj.setRollNumber(Integer.parseInt(studentId));
		studentobj.setFirstName("Swapnil");
		studentobj.setLastName("Adhav");
		studentobj.setDivision("A");
		
		return studentobj;
	}
}
