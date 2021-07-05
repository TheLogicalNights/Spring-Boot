package com.spring.JpaDeleteOperation.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.JpaDeleteOperation.repository.StudentRepository;
import com.spring.JpaDeleteOperation.services.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices{

	@Autowired
	StudentRepository studentRepositoryObj;
	
	@Override
	public Boolean deleteStudent(int rollNumber) {
		studentRepositoryObj.deleteById(rollNumber);
		return true;
	}

	@Override
	public Boolean deleteStudents() {
		studentRepositoryObj.deleteAll();
		return true;
	}

}
