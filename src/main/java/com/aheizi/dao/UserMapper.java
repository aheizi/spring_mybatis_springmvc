package com.aheizi.dao;

import com.aheizi.domain.User;

public interface UserMapper {
	
    User selectByUserId(Integer id);
    
}