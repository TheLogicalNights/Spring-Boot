package com.spring.JpaUpdateOperation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.spring.JpaUpdateOperation.model.StudentModel;

@Service
public interface StudentRepo extends CrudRepository<StudentModel, Integer>{

}
