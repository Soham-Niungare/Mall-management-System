package com.app.service;



import com.app.pojo.Item;

import jakarta.persistence.criteria.Order;

public interface IOrderService {
	Order addOrder(Order order);
	Order updateOrder(Order order);
	Order searchOrder(long id);
	boolean cancleMall(long id);
	Item addItean(Item item);
}
