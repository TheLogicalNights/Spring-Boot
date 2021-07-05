package com.spring.JpaReadOperation.services;

import java.util.List;

import com.spring.JpaReadOperation.model.StudentModel;

public interface StudentServices {
	public List<StudentModel> getStudents();
}
