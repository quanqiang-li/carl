package com.carl.user.service;

import java.util.List;

import com.carl.user.model.User;

public interface IUserService {

	List<User> select(User record);
	
	int updateUser(User record);

}
