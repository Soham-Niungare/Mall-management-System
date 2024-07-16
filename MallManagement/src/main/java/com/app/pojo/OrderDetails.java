package com.app.pojo;

import java.time.LocalDateTime;

public class OrderDetails {
	int id;
	LocalDateTime dateOfPurchase;
	float total;
	String payementMode;
	Shop shop_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPayementMode() {
		return payementMode;
	}
	public void setPayementMode(String payementMode) {
		this.payementMode = payementMode;
	}
	public Shop getShop_id() {
		return shop_id;
	}
	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}
	
}	
