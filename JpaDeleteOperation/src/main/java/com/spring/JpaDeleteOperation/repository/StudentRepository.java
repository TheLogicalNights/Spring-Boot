package com.spring.JpaDeleteOperation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.spring.JpaDeleteOperation.model.StudentModel;

@Service
public interface StudentRepository extends CrudRepository<StudentModel, Integer> {

}
