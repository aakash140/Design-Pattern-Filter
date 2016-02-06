package com.java.filter;

import java.util.List;

public interface Criteria {
	public List<Employee> meetsCriteria(List<Employee> employeeList);
}