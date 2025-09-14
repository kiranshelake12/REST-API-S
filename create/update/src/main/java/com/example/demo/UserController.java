package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")

public class UserController {
	
	@Autowired
	private UserService userService;
	

	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id  , @RequestBody User userDetails) {
		
		return userService.UserService(id,userDetails);
	}
	
	
}
	

