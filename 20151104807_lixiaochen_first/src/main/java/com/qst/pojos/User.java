package com.qst.pojos;

import com.qst.base.BaseEntity;

public class User extends BaseEntity<User> {
	private int userId;
	private String userName;
	private String userPwd;
	private String sex;
	private String userTel;
	private String address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String userPwd, String sex, String userTel, String address) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.sex = sex;
		this.userTel = userTel;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
