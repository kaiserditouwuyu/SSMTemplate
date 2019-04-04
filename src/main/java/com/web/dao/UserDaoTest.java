package com.web.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.BaseTest;
import com.web.entity.User;
import com.web.service.UserService;

public class UserDaoTest extends BaseTest {

	@Autowired
	private UserService userservice;
	
	@Test
	public void test() throws Exception {
		
		userservice.transactionMethod();
		
		System.out.println("HHHH");
	}
}
