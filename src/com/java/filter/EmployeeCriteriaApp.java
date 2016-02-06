package com.java.filter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCriteriaApp {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee("Aakash","Male","Single"));
		employeeList.add(new Employee("Vikas","Male","Single"));
		employeeList.add(new Employee("Neha","Female","Married"));
		employeeList.add(new Employee("Anjali","Female","Single"));
		employeeList.add(new Employee("Ajay","Male","Married"));
		employeeList.add(new Employee("Ravi","Male","Single"));
		employeeList.add(new Employee("Priya","Female","Married"));
		
		System.out.println("**********MALE EMPLOYEES**********");
		Criteria criteria=new MaleCriteria();
		List<Employee> maleEmployees= criteria.meetsCriteria(employeeList);
		for(Employee maleEmployee: maleEmployees)
			System.out.println("Name: "+maleEmployee.getName()+
							  " Gender: "+maleEmployee.getGender()+
							  "  Marital Staus: "+maleEmployee.getMaritalStatus());
		
		System.out.println("**********FEMALE EMPLOYEES**********");
		criteria=new FemaleCriteria();
		List<Employee> femaleEmployees= criteria.meetsCriteria(employeeList);
		for(Employee femaleEmployee: femaleEmployees)
			System.out.println("Name: "+femaleEmployee.getName()+
							  " Gender: "+femaleEmployee.getGender()+
							  "  Marital Staus: "+femaleEmployee.getMaritalStatus());
		
		System.out.println("**********SINGLE MALE EMPLOYEES**********");
		criteria=new AndCriteria();
		List<Employee> singleMaleEmployees= criteria.meetsCriteria(employeeList);
		for(Employee singleMaleEmployee: singleMaleEmployees)
			System.out.println("Name: "+singleMaleEmployee.getName()+
							  " Gender: "+singleMaleEmployee.getGender()+
							  "  Marital Staus: "+singleMaleEmployee.getMaritalStatus());
		
		System.out.println("**********SINGLE OR FEMALE EMPLOYEES**********");
		criteria=new OrCriteria();
		List<Employee> singleOrFemaleEmployees= criteria.meetsCriteria(employeeList);
		for(Employee singleOrFemaleEmployee: singleOrFemaleEmployees)
			System.out.println("Name: "+singleOrFemaleEmployee.getName()+
							  " Gender: "+singleOrFemaleEmployee.getGender()+
							  "  Marital Staus: "+singleOrFemaleEmployee.getMaritalStatus());
		
	}
}