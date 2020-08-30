package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.howtodoinjava.demo.model.Employee;
@RequestMapping("/")//url 
@RestController//Annotation to control the program 
public class EmployeeController {

	List<Employee> employeesList = new ArrayList<Employee>();//List is to add all employee details

//	@RequestMapping(method = RequestMethod.GET)//RequestMapping annotation to call get method
//    public List<Employee> getEmployees() 
//    {
//		return employeesList;
//    }
//	@RequestMapping(method = RequestMethod.POST)//post method
//    public String addEmployees() //addEmployees method
//    {
//		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
//		return "Employee Added";
//    }
	 @PostMapping("/employees")
	public String newEmployee(@RequestBody Employee newEmployee) {
		 employeesList.add(newEmployee);
		return "Employee Added";
	 }
	 @GetMapping("/employees")
//	 public List<Employee> getEmployees1() 
	 public String getEmployees1()
	    {
		 String tt1 = null;
			//return employeesList;
		 for (int i = 0; i < employeesList.size(); i++) {
	            tt1= tt1 + employeesList.get(i).toString() + "\n";
	        }
		 return tt1;
	    }
//	 }
	
//	@PostMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}
}
