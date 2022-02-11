package com.simplilearn.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.ecommerce.model.User;
import com.simplilearn.ecommerce.repository.UserRepository;

@RestController
@RequestMapping("/api/v2/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
