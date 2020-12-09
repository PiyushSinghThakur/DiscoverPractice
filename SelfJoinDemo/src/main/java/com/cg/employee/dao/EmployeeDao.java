package com.cg.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.employee.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{

}
