package com.spring.GetHandlerSettingResponseStatus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.GetHandlerSettingResponseStatus.Model.StudentModel;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping(path="/{studentId}")
	public ResponseEntity<StudentModel> getStudent(@PathVariable String studentId)
	{
		StudentModel studentobj = new StudentModel();
		studentobj.setRollNumber(Integer.parseInt(studentId));
		studentobj.setFirstName("Swapnil");
		studentobj.setLastName("Adhav");
		studentobj.setDivision("A");
		return new ResponseEntity<StudentModel>(studentobj,HttpStatus.OK);
	}

}
