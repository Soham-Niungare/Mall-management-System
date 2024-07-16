package com.app.repository;

import com.app.pojo.ShopOwner;

public interface IShopOwnerRepository {
	ShopOwner addShopOwner(ShopOwner shopOwner);
	ShopOwner updateShopOwner(ShopOwner shopOwner);
	ShopOwner searchShopOwner(long id);
	ShopOwner deleteShopOwner(long id);
}
