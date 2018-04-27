package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.repositories.UserJpaRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@GetMapping("/all")
	public List<Users> findAll(){
		return userJpaRepository.findAll();
	}
	
	@GetMapping("/{name}")
	public Users findByName(@PathVariable final String name) {
		return userJpaRepository.findByName(name);
	}
	
	@PostMapping("/load")
	public Users load(@RequestBody final Users users) {
		userJpaRepository.save(users);
		return userJpaRepository.findByName(users.getName());
	}
}
