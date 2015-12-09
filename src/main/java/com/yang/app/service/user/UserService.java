package com.yang.app.service.user;

import java.util.List;

import com.yang.app.model.user.User;


public interface UserService {
	public List<User> getUser(User user);
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
}
