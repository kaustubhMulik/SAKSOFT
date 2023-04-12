package com.crud.Saksoft.service;

import java.util.List;

import com.crud.Saksoft.entity.User;

public interface UserService {

	public User createUser(User user);
	public List<User> getAllUsers();
	public   User getUserById(Long id);
	public   void updateUser(Long id, User user);
	public   void deleteUser(Long id);
}
