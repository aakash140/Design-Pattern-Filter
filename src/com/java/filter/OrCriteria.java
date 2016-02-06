package com.java.filter;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {

	@Override
	public List<Employee> meetsCriteria(List<Employee> employeeList) {
		List<Employee> singleOrFemales=new ArrayList<Employee>();
		for(Employee employee:employeeList){
			if(employee.getGender().equalsIgnoreCase("Female")|| 
					employee.getMaritalStatus().equalsIgnoreCase("Single"))
				singleOrFemales.add(employee);
		}
		return singleOrFemales;
	}

}
