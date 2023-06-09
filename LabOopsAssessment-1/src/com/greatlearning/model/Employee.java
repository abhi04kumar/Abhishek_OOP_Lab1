package com.greatlearning.model;

public class Employee {
	
	//Declaration of private variables
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	//Declaration of default constructor
	public Employee() {	}
	
	//Declaration of parameterized constructor
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
		
	//Getter for First Name
	public String getFirstname() {
		return firstname;
	}
	
	//Setter for First Name
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	//Getter for Last Name
	public String getLastname() {
		return lastname;
	}
	
	//Setter for Last Name
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	//Getter for Email
	public String getEmail() {
		return email;
	}
	
	//Setter for Email
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Getter for Password
	public String getPassword() {
		return password;
	}
	
	//Setter for Password
	public void setPassword(String password) {
		this.password = password;
	}
	
}
