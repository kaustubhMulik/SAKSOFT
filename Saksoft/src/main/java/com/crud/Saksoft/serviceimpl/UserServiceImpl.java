package com.crud.Saksoft.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Saksoft.entity.User;
import com.crud.Saksoft.repository.UserRepository;
import com.crud.Saksoft.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public User createUser(User user) {
		return repository.save(user);
		
		
	}

	@Override
	public List<User> getAllUsers() {

		return repository.findAll();
	}

	@Override
	public User getUserById(Long id) {
	
		return repository.findById(id).get();
	}

	@Override
	public void updateUser(Long id, User user) {
		repository.save(user);
		
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
		
	}


   
        
    
}