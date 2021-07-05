package com.spring.JpaUpdateOperation.services;

import org.springframework.stereotype.Service;

import com.spring.JpaUpdateOperation.model.StudentModel;

@Service
public interface StudentServices {
	public Boolean updateStudent(int rollNumber,StudentModel studentObj);
}
