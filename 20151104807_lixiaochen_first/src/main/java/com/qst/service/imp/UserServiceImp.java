package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.UserDao;
import com.qst.pojos.User;
import com.qst.service.UserSerivce;


@Service
public class UserServiceImp implements UserSerivce {
	
	public UserServiceImp() {
		// TODO Auto-generated constructor stub
		System.out.println("ffffffffffffffffffffffffffff");
	}
	@Resource
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}
	public List<User> listAllUsers(User user) {
		return userDao.listAllUsers(user);
	}
	public int getTotalPageNum() {
		return userDao.getTotalPageNum();
	}
	public User findUserById(int userId) {
		return userDao.findUserById(userId);
	}
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}
	public List<User> listAllUsersByJson() {
		// TODO Auto-generated method stub
		return userDao.listAllUsersByJson();
	}
	public User listUsers(String userName) {
		// TODO Auto-generated method stub
		return userDao.listUsers(userName);
	}
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
