package com.app.pojo;

public class Mall {
	long id;
	MallAdmin mallAdmin;
	String mallName;
	String location;
	Shop shops_id;
	String categories;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Shop getShops_id() {
		return shops_id;
	}
	public void setShops_id(Shop shops_id) {
		this.shops_id = shops_id;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
}
