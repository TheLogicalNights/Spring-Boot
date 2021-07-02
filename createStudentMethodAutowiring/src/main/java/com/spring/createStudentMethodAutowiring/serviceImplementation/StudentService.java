package com.spring.createStudentMethodAutowiring.serviceImplementation;

import org.springframework.stereotype.Service;

import com.spring.createStudentMethodAutowiring.model.StudentModel;
import com.spring.createStudentMethodAutowiring.services.StudentServices;

@Service
public class StudentService implements StudentServices
{
	@Override
	public StudentModel createStudent(StudentModel studentObj) 
	{
		StudentModel returnValue = new StudentModel();
		returnValue.setRollNumber(studentObj.getRollNumber());
		returnValue.setFirstName(studentObj.getFirstName());
		returnValue.setLastName(studentObj.getLastName());
		returnValue.setEmail(studentObj.getEmail());
		return returnValue;
	}
}
