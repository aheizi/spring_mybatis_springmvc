package com.aheizi.service;

import java.util.List;

import com.aheizi.domain.User;

public interface UserService {
	
	public User getUserById(int userId);
	
	public List<User> getAllUser();
}
