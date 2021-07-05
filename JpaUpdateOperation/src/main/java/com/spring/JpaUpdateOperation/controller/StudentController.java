package com.spring.JpaUpdateOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JpaUpdateOperation.model.StudentModel;
import com.spring.JpaUpdateOperation.servicesImpl.StudentServicesImpl;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentServicesImpl studentServiceImplObj;
	
	@PutMapping(path="/{rollNumber}",
				consumes = {MediaType.APPLICATION_JSON_VALUE,
							MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> updateStudent(@PathVariable int rollNumber,@RequestBody StudentModel studentObj)
	{
		Boolean bRet = studentServiceImplObj.updateStudent(rollNumber,studentObj);
		if(bRet)
		{
			return new ResponseEntity<String>("Student updated successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Unable to update student",HttpStatus.NOT_MODIFIED);
		}
	}
}
