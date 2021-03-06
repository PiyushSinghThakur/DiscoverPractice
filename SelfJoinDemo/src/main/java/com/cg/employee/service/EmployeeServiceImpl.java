package com.cg.employee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
		
	}

	@Override
	public List<Employee> viewEmployee() {
		return employeeDao.findAll();
	}
	
}
