package com.app.repository;

import com.app.pojo.Mall;

public interface IMalltRepository {
	Mall addMall(Mall mall);
	Mall updateMall(Mall mall);
	Mall searchMall(long id);
}
