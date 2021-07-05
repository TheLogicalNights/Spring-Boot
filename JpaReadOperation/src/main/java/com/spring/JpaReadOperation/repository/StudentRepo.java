package com.spring.JpaReadOperation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.spring.JpaReadOperation.model.StudentModel;

@Service
public interface StudentRepo extends CrudRepository<StudentModel, Integer>{
	public StudentModel findById(int id);
}
