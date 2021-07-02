package com.spring.createStudentMethodAutowiring.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.createStudentMethodAutowiring.model.StudentModel;
import com.spring.createStudentMethodAutowiring.services.StudentServices;

@Service
public class StudentService implements StudentServices
{
	@Autowired
	StudentModel returnValue;
	@Override
	public StudentModel createStudent(StudentModel studentObj) 
	{
		returnValue.setRollNumber(studentObj.getRollNumber());
		returnValue.setFirstName(studentObj.getFirstName());
		returnValue.setLastName(studentObj.getLastName());
		returnValue.setEmail(studentObj.getEmail());
		return returnValue;
	}
}
