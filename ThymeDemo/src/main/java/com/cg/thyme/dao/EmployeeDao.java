package com.cg.thyme.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.thyme.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
