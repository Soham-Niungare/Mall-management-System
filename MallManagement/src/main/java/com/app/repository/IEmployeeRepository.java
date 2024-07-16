package com.app.repository;

import com.app.pojo.Employee;

public interface IEmployeeRepository {
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee searchEmployee(long id);
	boolean deleteEmployee(long id);
	
}
