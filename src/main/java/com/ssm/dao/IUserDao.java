package com.ssm.dao;

import java.util.Map;

import com.ssm.entity.User;

public interface IUserDao {

	
	public User login(Map<String,String> map);
}
