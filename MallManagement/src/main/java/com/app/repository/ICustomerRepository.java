package com.app.repository;

import com.app.pojo.Customer;

public interface ICustomerRepository {
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer searchCustomer(long id);
	Customer deleteCustomer(long id);
}
