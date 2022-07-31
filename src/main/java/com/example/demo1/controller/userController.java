package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.entity.Employee;
import com.example.demo1.service.UserService;



@Controller
@RequestMapping("/")
public class userController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/add")
	public Employee addUser(@RequestBody Employee user)
	{
		return userService.createUser(user);
	}
	

}
