package com.aheizi.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aheizi.domain.User;
import com.aheizi.service.UserService;

@Controller
@RequestMapping("/user") 
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser") 
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        logger.info("username==============" + user.getUserName());
        model.addAttribute("user", user);
        return "showUser";
	}
	
	@RequestMapping("/showAllUser")
	public String showAllUser(HttpServletRequest request,Model model){
		List<User> userList = userService.getAllUser();
		logger.info("userList's size==============" + userList.size());
		model.addAttribute("userList",userList);
		return "showAllUser";
	}
}
