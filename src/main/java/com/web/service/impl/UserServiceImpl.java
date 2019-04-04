package com.web.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.UserDao;
import com.web.entity.User;
import com.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
	@Override
	public User findUserById(int id) {
		User user=userdao.findUsername(id);
		return user;
	}

	@Override
	public int insertUser(User user) {
		int result=userdao.insertUser(user);
		return result;
	}

	@Override
	public int deleteUser(int id) {
		int result=userdao.deleteUser(id);
		return result;
	}

	@Override
	public int updateUser(User user) {
		int result=userdao.updateUser(user);
		return result;
	}

	@Transactional
	@Override
	public void transactionMethod() {
		
		User user=new User();
		user.setUsername("小康");
		user.setPassword("123456");
		userdao.insertUser(user);
		int i=10/0;
		userdao.insertUser(user);
		
		
	}
	
	
}
