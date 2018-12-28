package com.qst.service;

import java.util.List;

import com.qst.pojos.Order;

public interface OrderService {
	public List<Order> listOrder();
	public int addOrder(Order order);
	public void deleteOrder(int orderId);
}
