package com.app.repository;

import com.app.pojo.Shop;

public interface IShopRepository {
	Shop addShop(Shop shop);
	Shop updateShop(Shop shop);
	Shop searchShopById(long id);
	boolean deleteShop(long id);
}
