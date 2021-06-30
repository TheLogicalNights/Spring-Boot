package com.spring.GetHandlerReturningJavaObjAsJsonOrXml.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.GetHandlerReturningJavaObjAsJsonOrXml.Model.StudentModel;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@GetMapping(path="/{studentId}",produces = {MediaType.APPLICATION_XML_VALUE ,
												MediaType.APPLICATION_JSON_VALUE})
    public StudentModel getStudent(@PathVariable String studentId)
    {
        StudentModel studentobj = new StudentModel();
        studentobj.setRollNumber(Integer.parseInt(studentId));
        studentobj.setFirstName("Swapnil");
        studentobj.setLastName("Adhav");
        studentobj.setDivision("A");
        return studentobj;
        
    }
}
