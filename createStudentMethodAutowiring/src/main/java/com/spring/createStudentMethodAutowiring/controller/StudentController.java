package com.spring.createStudentMethodAutowiring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.createStudentMethodAutowiring.model.StudentModel;
import com.spring.createStudentMethodAutowiring.serviceImplementation.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	Map<String, StudentModel> student;
	
	@Autowired
	StudentService studentServiceObj;
	
	@GetMapping(path="/{studentId}")
	public ResponseEntity<StudentModel> getStudent(@PathVariable String studentId)
	{
		if(student.containsKey(studentId))
		{
			return new ResponseEntity<StudentModel>(student.get(studentId),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
							 MediaType.APPLICATION_XML_VALUE},
			    produces = {MediaType.APPLICATION_JSON_VALUE,
			    		MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> createStudent(@Valid @RequestBody StudentModel studentObj)
	{
		StudentModel returnValue = studentServiceObj.createStudent(studentObj);
		
		if(student==null)
		{
			student = new HashMap<>();
		}
		student.put(returnValue.getRollNumber(), returnValue);
		return new ResponseEntity<String>("Student created successfully...",HttpStatus.OK);
	}
}
