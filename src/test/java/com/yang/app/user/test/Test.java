package com.yang.app.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yang.app.dao.user.UserDao;
import com.yang.app.model.user.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:Spring.xml") ;
//		UserService service=(UserServiceImpl) context.getBean("userService");
//		User user=new User();
//		user.setUsername("ych");
//		user.setPassword("ssgss");
//		service.addUser(user);
		UserDao userDao=(UserDao) context.getBean("userDao");
		User user=new User();
		user.setUsername("ych");
		user.setPassword("ssgss");
		userDao.addUser(user);
	}

}
