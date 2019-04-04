package com.web.service;

import com.web.entity.User;

public interface UserService {
	User findUserById(int id);
	
	int insertUser(User user);
	
	int deleteUser(int id);
	
	int updateUser(User user);
	
	void transactionMethod();
}
