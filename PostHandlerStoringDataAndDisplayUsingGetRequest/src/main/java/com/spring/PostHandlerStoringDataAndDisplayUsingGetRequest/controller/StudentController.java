package com.spring.PostHandlerStoringDataAndDisplayUsingGetRequest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.PostHandlerStoringDataAndDisplayUsingGetRequest.Model.StudentModel;

@RestController
@RequestMapping("/students")
public class StudentController {
	Map<String, StudentModel> student;
	
	@GetMapping("/{studentId}")
	public ResponseEntity<StudentModel> getStudent(@PathVariable String studentId)
	{
		if(student.containsKey(studentId))
		{
			return new ResponseEntity<>(student.get(studentId),HttpStatus.OK);
	
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping
	public ResponseEntity<StudentModel> createStudent(@RequestBody StudentModel studentobj)
	{
		if(student==null)
		{
			student = new HashMap<>();
		}
		student.put(studentobj.getRollNumber(), studentobj);
		return new ResponseEntity<StudentModel>(studentobj,HttpStatus.OK);
	}
}
