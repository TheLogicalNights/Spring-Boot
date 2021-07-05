package com.spring.JpaReadOperation.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.JpaReadOperation.model.StudentModel;
import com.spring.JpaReadOperation.repository.StudentRepo;
import com.spring.JpaReadOperation.services.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices {
	
	@Autowired
	StudentRepo studentRepoObj;
	@Override
	public List<StudentModel> getStudents() {
		List<StudentModel> returnValue = (List<StudentModel>) studentRepoObj.findAll();
		return returnValue;
	}

}
