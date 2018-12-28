package com.qst.dao;

import java.util.List;

import com.qst.pojos.Order;

public interface OrderDao {

	public List<Order> listOrder();
	public int addOrder(Order order);
	public void deleteOrder(int orderId);
}
