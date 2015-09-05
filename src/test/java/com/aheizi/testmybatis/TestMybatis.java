package com.aheizi.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aheizi.domain.User;
import com.aheizi.service.UserService;

public class TestMybatis {
private static Logger logger = Logger.getLogger(TestSpringDemo.class);
	
	private ApplicationContext ac = null;
	
    @Resource
    private UserService userService = null;
    
	@Before
	public void before() {
	    ac = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
	    userService = (UserService) ac.getBean("userService");
	}
 
    @Test
    public void test1() {
        User user = userService.getUserById(1);
        logger.info("userName" + user.getUserName());
    }
}
