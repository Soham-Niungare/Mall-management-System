package com.app.repository;

import com.app.pojo.Item;

public interface IItemRepository {
	Item addItem(Item item);
	Item updateItem(Item item);
	Item searchItem(long id);
	Item deleteItem(long id);
}
