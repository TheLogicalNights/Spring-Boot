package com.spring.JpaInsertOperation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.JpaInsertOperation.Model.StudentModel;
import com.spring.JpaInsertOperation.serviceImpl.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices {
	
	@Autowired
	StudentModel studentModelObj;
	@Override
	public Boolean createStudent(StudentModel studentObj) {
		studentModelObj.setRollNumber(studentObj.getRollNumber());
		studentModelObj.setFirstName(studentObj.getFirstName());
		studentModelObj.setLastName(studentObj.getLastName());
		studentModelObj.setEmail(studentObj.getEmail());
		return true;
	}

}
