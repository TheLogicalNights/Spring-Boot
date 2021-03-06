package com.spring.firstApplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.firstApplication.model.UserRest;

@RestController
@RequestMapping("/users")
public class User {
	
//	@GetMapping(path="/{userId}")
//	public UserRest getUser(@PathVariable String userId)
//	{
//		UserRest returnValue = new UserRest();
//		returnValue.setFirstName("Swapnil");
//		returnValue.setLastName("Adhav");
//		returnValue.setEmail("swapniladhav560@gmail.com");
//		returnValue.setUserId(userId);
//		return returnValue;
//	}
	
	@GetMapping(path="/{userId}")
	public ResponseEntity<UserRest> getUser(@PathVariable String userId)
	{
		UserRest returnValue = new UserRest();
		returnValue.setFirstName("Swapnil");
		returnValue.setLastName("Adhav");
		returnValue.setEmail("swapniladhav560@gmail.com");
		returnValue.setUserId(userId);
		return new ResponseEntity<UserRest>(returnValue,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	public String getUser(@RequestParam(value="Page",defaultValue = "1") int page,
						  @RequestParam(value="limit",defaultValue = "50") int limit)
	{
		return "getUser was called with page = " + page + " limit = " + limit;
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
