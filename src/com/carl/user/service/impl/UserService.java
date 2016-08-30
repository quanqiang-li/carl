package com.carl.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carl.user.dao.UserMapper;
import com.carl.user.model.User;
import com.carl.user.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> select(User record) {
		return userMapper.select(record);
	}
}
