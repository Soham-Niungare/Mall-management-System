package com.app.pojo;

import java.time.LocalDate;

public class Item {
	long id;
	LocalDate manufacturing;
	LocalDate expiry;
	float price;
	String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
