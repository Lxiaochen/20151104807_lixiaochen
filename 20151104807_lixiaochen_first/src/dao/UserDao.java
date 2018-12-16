package com.qst.dao;

import com.qst.po.User;

/**
 * 用户DAO层接口
 */
public interface UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public User findUser( String usercode,
                          String password);
}
