package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")

public class Controller {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping
	public String createUser(@RequestBody User user) {
		
		
		 userService.createUser(user);
	
		 return "added sucessfully";
	}


}
