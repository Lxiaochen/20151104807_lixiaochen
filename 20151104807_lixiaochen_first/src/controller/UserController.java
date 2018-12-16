package com.qst.controller;
import com.qst.po.User;
import com.qst.service.UserService;
import com.qst.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * 鐢ㄦ埛鎺у埗鍣ㄧ被
 */
@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * 用户登录
	 */

	private UserService userService = new UserServiceImpl();

	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(String usercode,String password,Model model,HttpSession session) {
		// 通过账号和密码查询用户
		User user = this.userService.findUser(usercode, password);
		if(user != null){		
			// 将对象添加到Session
			session.setAttribute("LOGIN_USER",user);
			// 跳转到客户 Controller
			return "redirect:customer/list.action";
			
			

		}
		model.addAttribute("msg", "用户名或密码错误");
         //返回登陆页面
		return "login";
	}
	
	/**
	 * 模拟其他类中跳转到客户管理页面的方法
	 */
	@RequestMapping(value = "/toCustomer.action")
	public String toCustomer() {
	    return "customer";
	}
	
	/**
	 * 閫�鍑虹櫥褰�
	 */
	@RequestMapping(value = "/logout.action")
	public String logout(HttpSession session) {
	    // 娓呴櫎Session
	    session.invalidate();
	    // 閲嶅畾鍚戝埌鐧诲綍椤甸潰鐨勮烦杞柟娉�
	    return "redirect:login.action";
	}
	/**
	 * 鍚戠敤鎴风櫥闄嗛〉闈㈣烦杞�
	 */
	@RequestMapping(value = "/login.action", method = RequestMethod.GET)
	public String toLogin() {
	    return "login";
	}


}
