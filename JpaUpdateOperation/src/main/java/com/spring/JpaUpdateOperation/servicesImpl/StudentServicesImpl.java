package com.spring.JpaUpdateOperation.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.JpaUpdateOperation.model.StudentModel;
import com.spring.JpaUpdateOperation.repository.StudentRepo;
import com.spring.JpaUpdateOperation.services.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices{

	@Autowired
	StudentRepo studentRepoObj;
	@Override
	public Boolean updateStudent(int rollNumber, StudentModel studentObj) {
		
		studentObj.setRollNumber(rollNumber);
		studentRepoObj.save(studentObj);
		return true;
	}

}
