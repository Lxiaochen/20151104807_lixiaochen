package com.qst.dao;

import java.util.List;

import com.qst.pojos.User;

public interface UserDao {
	public void addUser(User user);
	public List<User> listAllUsers(User user);
	public User listUsers(String userName);
	public List<User> listAllUsersByJson();
	public int getTotalPageNum();
	public User findUserById(int userId);
	public void updateUser(User user);
	public void deleteUser(int userId);
	public User login(User user);
}
