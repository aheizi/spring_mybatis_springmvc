package com.aheizi.dao;

import java.util.List;

import com.aheizi.domain.User;

public interface UserMapper {
	
    User selectByUserId(Integer id);
    
    List<User> getAllUser();
}