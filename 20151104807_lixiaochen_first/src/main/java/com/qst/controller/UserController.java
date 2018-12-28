package com.qst.controller;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qst.pojos.User;
import com.qst.service.UserSerivce;

@RequestMapping(value = "/user")
@Controller
public class UserController {
	@Resource
	private UserSerivce userService;

	public UserSerivce getUserService() {
		return userService;
	}
	public void setUserService(UserSerivce userService) {
		this.userService = userService;
	}
	/**
	 * ����ֵ��ʾ��ͼ����index����
	 */
	//�û����
	@RequestMapping(value = "/addUser")
	public String addUser(User user) {
		
		userService.addUser(user);
		// ��ͼ������
		return "user/addUser";
	}
	//��ҳ�б��ѯ
	@RequestMapping(value = "/listUser")
	public String listUser(User user,HttpServletRequest request) {
		user.setPage(true);
		List<User> list = userService.listAllUsers(user);
		int total = userService.getTotalPageNum();
		System.out.println(total);
		int totalPage = 0;
		if(total%2==0) {
			totalPage = total/2;
		}else {
			totalPage = total/2+1;
		}
		user.setList(list);
		user.setTotalPage(totalPage);
		request.setAttribute("page", user);
		return "user/listUser";
	}

	//ͨ��id��ѯ�û���Ϣ
	@RequestMapping(value = "/query")
	public String queryById(User user,HttpServletRequest request) {
		User user2 = userService.findUserById(user.getUserId());
		request.setAttribute("u", user2);
		return "user/updateUser";
	}
	
	//�����û���Ϣ
	@RequestMapping(value = "/update")
	public String updateUser(User user,HttpServletRequest request) {
		userService.updateUser(user);
		return listUser(user, request);
	}
	
	//ͨ��idɾ���û���Ϣ
	@RequestMapping(value = "/delete")
	public String deleteUser(User user,HttpServletRequest request) {
		userService.deleteUser(user.getUserId());
		return listUser(user, request);
	}
	//
	@RequestMapping(value = "/login")
	public String login(User user,HttpServletRequest request) {
		userService.login(user);
		return "main";
	}
	
	
}
