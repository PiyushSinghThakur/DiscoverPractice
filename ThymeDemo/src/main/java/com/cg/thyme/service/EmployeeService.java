package com.cg.thyme.service;

import java.util.List;

import com.cg.thyme.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public List<Employee> viewEmployee();
}
