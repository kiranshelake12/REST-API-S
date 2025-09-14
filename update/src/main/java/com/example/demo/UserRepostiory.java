package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepostiory extends JpaRepository<User , Integer>{

	User save(User user);

}
