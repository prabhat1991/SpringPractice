package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.models.UsersContact;
import com.example.demo.repositories.UsersContactRepository;

@RestController
@RequestMapping("/contacts")
public class UsersContactController {
	
	@Autowired
	private UsersContactRepository usersContactRepository;

	@GetMapping("/all")
	public List<UsersContact> getusersContacts(){
		return usersContactRepository.findAll();
	}
	
	@GetMapping("/update/{name}")
	public List<UsersContact> update(@PathVariable final String name){
		UsersContact contact = new UsersContact();
		Users users = new Users();
		users.setName(name);
		users.setTeamName("Development");
		users.setSalary(2000);
		
		contact.setPhoneNo(1234567800);
		contact.setUsers(users);
		
		usersContactRepository.save(contact);
		return usersContactRepository.findAll();
	}
}
