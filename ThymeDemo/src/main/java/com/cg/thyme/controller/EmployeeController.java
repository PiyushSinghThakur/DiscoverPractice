package com.cg.thyme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.thyme.entity.Employee;
import com.cg.thyme.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/emp")
	public String empForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("emp",employee);
		return "emp-form";
	}
	@PostMapping("/emp")
	public String empSubmit(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("emp" , employeeService.addEmployee(employee));
		return "result";
	}
	@GetMapping("/view")
	public String viewEmployee(Model model) {
		model.addAttribute("employees", employeeService.viewEmployee());
        return "list-employees";
	}
}
