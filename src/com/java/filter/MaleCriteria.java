package com.java.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {

	@Override
	public List<Employee> meetsCriteria(List<Employee> employeeList) {
		List<Employee> male=new ArrayList<Employee>();
		for(Employee employee:employeeList){
			if(employee.getGender().equalsIgnoreCase("Male"))
				male.add(employee);
		}
		return male; 
	}
}