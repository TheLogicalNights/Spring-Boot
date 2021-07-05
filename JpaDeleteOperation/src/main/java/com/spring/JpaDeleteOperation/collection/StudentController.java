package com.spring.JpaDeleteOperation.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JpaDeleteOperation.servicesImpl.StudentServicesImpl;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentServicesImpl studentServicesImplObj;
	
	@DeleteMapping(path="/{rollNumber}")
	public ResponseEntity<String> deleteStudent(@PathVariable int rollNumber)
	{
		Boolean bRet = studentServicesImplObj.deleteStudent(rollNumber);
		if(bRet)
		{
			return new ResponseEntity<String>("User deleted successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Unable to delete student",HttpStatus.NOT_MODIFIED);
		}
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteStudents()
	{
		Boolean bRet = studentServicesImplObj.deleteStudents();
		if(bRet)
		{
			return new ResponseEntity<String>("Students deleted successfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Unable to delete students",HttpStatus.NOT_MODIFIED);
		}
	}
}
