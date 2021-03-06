package com.carl.user.dao;

import com.carl.user.model.User;
import com.carl.user.model.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
	@Override
	public List<User> selectByExample(Object example);
}