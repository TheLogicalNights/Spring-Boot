package com.spring.JpaInsertOperation.Model;

public class StudentModel {
	private String rollNumber;
	private String firstName;
	private String lastName;
	private String email;

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(String rollNumber, String firstName, String lastName, String email) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

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
