package com.cg.employee.service;


import java.util.List;
import com.cg.employee.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public List<Employee> viewEmployee();
}
