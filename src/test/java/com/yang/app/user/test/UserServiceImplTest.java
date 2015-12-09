package com.yang.app.user.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yang.app.dao.user.UserDao;
import com.yang.app.model.user.User;
import com.yang.app.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:Spring.xml"})
public class UserServiceImplTest {
	@Resource
	private UserService userService;
	@Resource
	private UserDao userDao;
	@Test
	public void testGetUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		User user=new User();
		user.setUsername("ych");
		user.setPassword("ssgss");
		userDao.addUser(user);
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}
	
}
