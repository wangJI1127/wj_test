package com.ssm.service;

import java.util.Map;

import com.ssm.entity.User;
public interface IUserService {
	/**
     * ��¼
     *
     * @param map
     * @return
     */
	public User login(Map<String, String> map);
}
