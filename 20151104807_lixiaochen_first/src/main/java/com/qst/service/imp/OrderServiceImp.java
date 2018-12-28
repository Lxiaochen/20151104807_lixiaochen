package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.OrderDao;
import com.qst.pojos.Order;
import com.qst.service.OrderService;

@Service
public class OrderServiceImp implements OrderService{

	@Resource
	private OrderDao orderDao;
	public List<Order> listOrder() {
		// TODO Auto-generated method stub
		return orderDao.listOrder();
	}

	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.addOrder(order);
	}

	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		orderDao.deleteOrder(orderId);
	}

}
