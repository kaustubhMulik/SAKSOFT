package com.crud.Saksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Saksoft.entity.User;
import com.crud.Saksoft.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	@PostMapping("/user")
	public void saveUser(@RequestBody User user)
	{
		service.createUser(user);
	}
	
	@GetMapping("/user")
	private List<User> getAllUser()
	{
		return service.getAllUsers();
		
	}
	@GetMapping("/user/{userid}")
	private User getUserById(@PathVariable("userid") long id)
	{
		return service.getUserById(id);

	}
	@PatchMapping("/user1")
	private User updateUser(@RequestBody User user, long id)
	{
		service.updateUser(id, user);
		return user;
	}
	@DeleteMapping("user/{userid}")
	public void deleteUser(@PathVariable("userid") long id)
	{
		service.deleteUser(id);
	}
	}
