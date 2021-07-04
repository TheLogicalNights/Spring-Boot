package com.spring.JpaInsertOperation.dbRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.spring.JpaInsertOperation.Model.StudentModel;

@Service
public interface StudentRepo extends CrudRepository<StudentModel, Integer>{

}
