package com.java.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {

	@Override
	public List<Employee> meetsCriteria(List<Employee> employeeList) {
		List<Employee> female=new ArrayList<Employee>();
		for(Employee employee:employeeList){
			if(employee.getGender().equalsIgnoreCase("Female"))
				female.add(employee);
		}
		return female; 
	}
}