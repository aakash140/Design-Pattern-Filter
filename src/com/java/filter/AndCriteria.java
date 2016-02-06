package com.java.filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

	@Override
	public List<Employee> meetsCriteria(List<Employee> employeeList) {
		List<Employee> singleMales=new ArrayList<Employee>();
		for(Employee employee:employeeList){
			if(employee.getGender().equalsIgnoreCase("Male")&& 
					employee.getMaritalStatus().equalsIgnoreCase("Single"))
				singleMales.add(employee);
		}
		return singleMales;
	}
}