package com.greatlearning.email;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private String emailAddress;
	private String password;


	public Employee(String firstName, String lastName, String department) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
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
	public void setLasttName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		//public void m1() {
		//System.out.println(emp.count);
		//}
		//public static void increment() {
		//System.out.println(emp.count);
	}//
}