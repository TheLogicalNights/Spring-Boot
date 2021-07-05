package com.spring.JpaReadOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JpaReadOperation.model.StudentModel;
import com.spring.JpaReadOperation.servicesImpl.StudentServicesImpl;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentServicesImpl studentServicesImplObj;

	@GetMapping
	public ResponseEntity<List<StudentModel>> getStudents() {
		List<StudentModel> list = studentServicesImplObj.getStudents();
		return new ResponseEntity<List<StudentModel>>(list, HttpStatus.OK);
	}
}
