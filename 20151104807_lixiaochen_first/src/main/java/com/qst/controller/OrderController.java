package com.qst.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.pojos.Order;
import com.qst.service.OrderService;

@RequestMapping(value = "/order")
@Controller
public class OrderController {

	@Resource
	private OrderService orderService;
	@RequestMapping(value = "/add")
	public String addOrder(Order order,HttpServletRequest request){
		orderService.addOrder(order);
		return listOrder(request);
	}
	
	@RequestMapping(value = "/select")
	public String listOrder(HttpServletRequest request){
		List<Order> list=orderService.listOrder();
		request.setAttribute("list", list);
		return "order/listOrder";
	}
	@RequestMapping(value = "/delete")
	public String deleteOrder(int id,HttpServletRequest request){
		orderService.deleteOrder(id);
		return listOrder(request);
	}
}
