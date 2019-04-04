package com.web.dao;

import org.springframework.stereotype.Service;

import com.web.entity.User;

public interface UserDao {
	User findUsername(int id);
	
	int insertUser(User user);
	
	int deleteUser(int id);
	
	int updateUser(User user);
}
