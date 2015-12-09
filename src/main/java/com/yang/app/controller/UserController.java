package com.yang.app.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yang.app.dao.user.UserDao;
import com.yang.app.model.user.User;
import com.yang.app.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private final Logger log=Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;
	@Resource
	private UserDao userDao;
	@RequestMapping("/home")
	public String home(){
		log.info("返回首页");
		return "index";
	}
	@RequestMapping("add")
	public String addUser()
	{
		User user=new User();
		user.setUsername("cyrusyang");
		user.setPassword("32zhjlychh12");
		userDao.addUser(user);
		return "add";
	}	
	
}
