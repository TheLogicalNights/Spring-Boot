package com.spring.DeleteHandlerDeletingStudent.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	Map<String, StudentModel> student;
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
							 MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> createStudent(@RequestBody StudentModel studentObj)
	{
		if(student==null)
		{
			student = new HashMap<>();
		}
		student.put(studentObj.getRollNumber(), studentObj);
		return new ResponseEntity<String>("Student created successfully" ,HttpStatus.OK);
	}
	
	@DeleteMapping(path="/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable String studentId)
	{
		student.remove(studentId);
		return new ResponseEntity<String>("Student deleted successfully",HttpStatus.OK);
	}
}
