package com.spring.createStudentMethodAutowiring.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;

@Service
public class StudentModel 
{
	@NotNull(message = "rollnumber cannot be null")
	private String rollNumber;
	@NotNull(message = "first name cannot be null")
	private String firstName;
	@NotNull(message = "last name cannot be null")
	private String lastName;
	@NotNull(message = "email id cannot be null")
	@Email(message = "Invalid email id please enter valid email id")
	private String email;

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
