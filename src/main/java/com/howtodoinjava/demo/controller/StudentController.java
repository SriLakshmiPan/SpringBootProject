package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.request.Student;

@RequestMapping("/student") // basic url
@RestController
public class StudentController {
	List<Student> studentsList = new ArrayList<Student>();

	@PostMapping("/addStudentDetails") // request type - post, get, delete
	public String newStudent(@RequestBody Student student) { //newStudent-method , student- request
		studentsList.add(student);
		return "Student Added";
	}

	@GetMapping("/getStudentDetailsbyID") ///    student/getStudentDetailsbyID - url
	public Student getStudentDetails(@RequestParam Integer studentId) { //getStudentDetails-method, studentId- request
		System.out.println("studentsList" + studentsList.toString());
		for (Student stu : studentsList) {
			if (stu.getId() == studentId) {
				return stu; //stu- response
			}
		}
		return null;
	}
}