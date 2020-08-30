package com.howtodoinjava.demo.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 3306262202463164113L;

	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	
	Employee() {}

	  public Employee(Integer id, String firstName, String lastName, String email) {
	    this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	  }
	@Override
	public String toString() {//returns a string representation of an object
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + "]";
	}
}
