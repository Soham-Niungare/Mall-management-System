package com.app.service;

import com.app.pojo.Employee;

public interface IEmployeeService {
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee searchEmployee(long id);
	boolean deleteEmployee(long id);
}
