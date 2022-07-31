package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.dao.UserRepository;
import com.example.demo1.entity.Employee;



@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public Employee createUser(Employee user)
	{
		return userRepository.save(user);
	}
	
	public List<Employee> createUsers(List<Employee> users)
	{
		return userRepository.saveAll(users);
	}
	
	public Employee getUserById(int id)
	{
		return userRepository.findById(id).orElse(null);
		
	}
	
	public List<Employee> getUsers()
	{
		return userRepository.findAll();
		
	}

//	public User updateUser(User user)
//	{
//		userRepository.findById(user.getId()).orElse(null);
//		
//	}
	
	public String deleteUserById(int id)
	{
		 userRepository.deleteById(id);
		 return "user deleted";
	}


}
