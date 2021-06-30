package com.spring.PostHandlerValidationOfPostRequestBody.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class StudentModel 
{
	@NotNull(message = "Roll number cannot be null")
	private int rollNumber;
	@NotNull(message = "First name cannot be null")
	private String firstName;
	@NotNull(message = "Last name cannot be null")
	private String lastName;
	@NotNull(message = "Email id cannot be null")
	@Email(message = "Please enter a valid mail id")
	private String emailId;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
