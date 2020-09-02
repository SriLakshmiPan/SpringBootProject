package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.request.Employee;
import com.howtodoinjava.demo.model.request.EmployeeId;
import com.howtodoinjava.demo.model.response.EmployeeDetailsResponse;

@RequestMapping("/sample") // url
@RestController // Annotation to control the program
public class EmployeeController {
	List<Employee> employeesList = new ArrayList<Employee>();// List is to add all employee details
	Employee emp = new Employee();

	@PostMapping("/employees")
	public String newEmployee(@RequestBody Employee newEmployee) {
		employeesList.add(newEmployee);
		return "Employee Added";
	}

	@GetMapping("/getEmployees")
	public List<Employee> getEmployees1() {
		return employeesList;
	}

	@PostMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/getEmployeeDetailsbyID")
//	public Integer getEmployeeDetails (@RequestParam Integer empId) {
	public Employee getEmployeeDetails(@RequestParam Integer empId) {
		System.out.println("employeesList" + employeesList.toString());
		for (Employee emp : employeesList) {
			if (emp.getId() == empId) {
				return emp;
			}
		}
		return null;

//		return empDetails;
	}

}
