package com.app.pojo;

import jakarta.persistence.*;

@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int shopId;
	String shopCategory;
	Employee shopEmployeeID;
	String shopName;
	String customer;
	ShopOwner shopOwner;
	String leaveStatus;
	long id;
	
	public Shop(int shopId, String shopCategory, Employee shopEmployeeID, String shopName, String customer,
			ShopOwner shopOwner, String leaveStatus, long id) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopEmployeeID = shopEmployeeID;
		this.shopName = shopName;
		this.customer = customer;
		this.shopOwner = shopOwner;
		this.leaveStatus = leaveStatus;
		this.id = id;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public Employee getShopEmployeeID() {
		return shopEmployeeID;
	}
	public void setShopEmployeeID(Employee shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public ShopOwner getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
