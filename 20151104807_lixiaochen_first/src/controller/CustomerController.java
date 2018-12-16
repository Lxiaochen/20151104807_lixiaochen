package com.qst.controller;

import com.qst.po.BaseDict;
import com.qst.po.Customer;
import com.qst.po.User;
import com.qst.service.BaseDictService;
import com.qst.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * �û���½
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;
	private BaseDictService baseDictService;

	/**
	 *  �ͻ��б�
	 */
	@RequestMapping("/list.action")
	public String list(String custName, String custSource, String custIndustry,
			String custLevel, Model model) {
		//�����������пͻ�
		List<Customer> customers = customerService
				.findCustomerList(custName,
                                        custSource, custIndustry,custLevel);
		model.addAttribute("list", customers);

		return "customer";
	}
	
	/**
	 * 创建客户
	 */
	@RequestMapping("/customer/create.action")
	@ResponseBody
	public String customerCreate(Customer customer,HttpSession session) {
	    return "";
	}

	/**
	 * 通过id获取客户信息
	 */
	@RequestMapping("/customer/getCustomerById.action")
	@ResponseBody
	public Customer getCustomerById(Integer id) {
	    Customer customer = null;
	    return customer;
	}
	/**
	 * 更新客户
	 */
	@RequestMapping("/customer/update.action")
	@ResponseBody
	public String customerUpdate(Customer customer) {
	    return "";
	}

	/**
	 * 删除客户
	 */
	@RequestMapping("/customer/delete.action")
	@ResponseBody
	public String customerDelete(Integer id) {
		return "";
	}

}
