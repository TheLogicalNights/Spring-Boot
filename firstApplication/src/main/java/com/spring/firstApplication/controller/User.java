package com.spring.firstApplication.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class User {
	
	public String getUser()
	{
		return "getUser was called";
	}
	
	@PostMapping
	public String createUser()
	{
		return "createUser was called";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "updateUser was called";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "deleteUser was called";
	}
}