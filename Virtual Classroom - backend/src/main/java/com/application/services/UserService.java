package com.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.model.User;
import com.application.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepo;
	
	public String saveUser(User user)
	{
		userRepo.save(user);
		return "Register Successfully";
	}
	
	public String updateUserProfile(User user)
	{
		userRepo.save(user);
		return "User Updated Successfully";
	}
	
	public List<User> getAllUsers()
	{
		return (List<User>)userRepo.findAll();
	}
	
	public User fetchUserByEmail(String email)
	{
		return userRepo.findByEmail(email);
	}
	
	public User fetchUserByUsername(String username)
	{
		return userRepo.findByUsername(username);
	}
	
	public String fetchUserByEmailAndPassword(String email, String password)
	{
		userRepo.findByEmailAndPassword(email, password);
		return "Login Successfully";
	}
	
	public List<User> fetchProfileByEmail(String email)
	{
		return (List<User>)userRepo.findProfileByEmail(email);
	}
}