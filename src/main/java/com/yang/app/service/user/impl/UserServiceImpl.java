package com.yang.app.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yang.app.dao.user.UserDao;
import com.yang.app.model.user.User;
import com.yang.app.service.user.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	public List<User> getUser(User user) {
		// TODO Auto-generated method stub
		return userDao.getUser(user);
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

}
