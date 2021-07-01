package com.spring.PutHandlerUpdatingStudentDetails.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.PutHandlerUpdatingStudentDetails.model.StudentModel;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	Map<String, StudentModel> student;
	@GetMapping(path="/{studentId}",produces = {MediaType.APPLICATION_JSON_VALUE,
												MediaType.APPLICATION_XML_VALUE},
									consumes = {MediaType.APPLICATION_JSON_VALUE,
												MediaType.APPLICATION_XML_VALUE})
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
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
							 MediaType.APPLICATION_XML_VALUE},
				 consumes = {MediaType.APPLICATION_JSON_VALUE,
						 	 MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<StudentModel> createStudent(@RequestBody StudentModel studentObj)
	{
		if(student==null)
		{
			student = new HashMap<>();
		}
		student.put(studentObj.getRollNumber(), studentObj);
		return new ResponseEntity<StudentModel>(studentObj,HttpStatus.OK);
	}
	
	@PutMapping(path="/{studentId}",produces = {MediaType.APPLICATION_JSON_VALUE,
			 									MediaType.APPLICATION_XML_VALUE},
									consumes = {MediaType.APPLICATION_JSON_VALUE,
												MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<StudentModel> updateStudent(@PathVariable String studentId,
										@RequestBody StudentModel studentDetails)
	{
		StudentModel updateStudentObj = student.get(studentId);
		updateStudentObj.setFirstName(studentDetails.getFirstName());
		updateStudentObj.setLastName(studentDetails.getLastName());
		updateStudentObj.setDivision(studentDetails.getDivision());
		student.put(studentId, updateStudentObj);
		return new ResponseEntity<StudentModel>(updateStudentObj,HttpStatus.OK);
	}
}
