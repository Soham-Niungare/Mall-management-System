package com.app.service;

import com.app.pojo.Item;
import com.app.pojo.Mall;
import com.app.pojo.Shop;
import com.app.pojo.User;

public interface IAdminService {
	boolean approaveNewShop(Shop shop);
	User updateUser(User user);
	Item orderItem(Item item);
	User login(User user);
	boolean logOut();
}
