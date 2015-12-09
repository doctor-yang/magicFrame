package com.yang.app.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yang.app.model.user.User;
@Repository("userDao")
public interface UserDao {
	public List<User> getUser(User user);
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
}
