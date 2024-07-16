package com.app.service;

import java.util.List;

import com.app.pojo.Item;
import com.app.pojo.User;

public interface ICustomerService {
	List <Item> searchItem(String itemName);
	Item orderItem(Item item);
	boolean cancelOrder(long orderId);
	User login(User user); 
	boolean logOut();
}
