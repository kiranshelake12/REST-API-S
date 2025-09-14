package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepostiory userRepository;
	
	public User UserService(int id ,User userDetails) {
		
		User user = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("user not found"));
				
		user.setName(userDetails.getName());
		user.setAddress(userDetails.getAddress());
		user.setId(userDetails.getId());
		user.setPincode(userDetails.getPincode());
	    
		return userRepository.save(user);
		
		
	}


}
