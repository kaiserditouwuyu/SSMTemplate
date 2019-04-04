package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.entity.User;
import com.web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService; 

	@RequestMapping("/login")
	public String login() {
		User user=userService.findUserById(1);
		return "login";
	}
}
