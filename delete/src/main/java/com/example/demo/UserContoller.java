package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")

public class UserContoller{
	
	@Autowired
	private UserService userService;
	
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable int id) {
		 userService.deleteById(id);
		 return "delete successfully";
		
		
	}


}
