package com.java.filter;

public class Employee {
	String name;
	String gender;
	String maritalStatus;
	public Employee(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
}