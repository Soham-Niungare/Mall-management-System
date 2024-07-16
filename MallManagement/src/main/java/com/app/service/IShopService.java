package com.app.service;

import com.app.pojo.Employee;
import com.app.pojo.Item;
import com.app.pojo.Shop;

public interface IShopService {
	Shop addShop(Shop shop);
	Shop updateShop(Shop shop);
	Shop searchShopByid(long id);
	boolean addEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteShop(long id);
	Item addItem(Item item);
}
