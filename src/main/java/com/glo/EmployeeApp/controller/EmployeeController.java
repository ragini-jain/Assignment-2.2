package com.glo.EmployeeApp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.glo.EmployeeApp.model.EducationDetail;
import com.glo.EmployeeApp.model.Employee;
import com.glo.EmployeeApp.model.Employment;

public class EmployeeController {

	public static void main(String args[]) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Ragini", 24, "Developer",
				new EducationDetail("B.E", "73.67", "12/1/2016"),new Employment("Global Logic", 2, "Rozers")));
		employeeList.add(new Employee("Sonal", 26, "Manager",
				new EducationDetail("C.A", "77.3", "30/7/2014"),new Employment("TCS", 2, "Sample")));
		employeeList.add(new Employee("Komal", 24, "Tester",
				new EducationDetail("MSC", "78.34", "23/04/2016"),new Employment("SmartData", 2, "New")));
		employeeList.add(new Employee("Dhananjay", 30, "Admin",
				new EducationDetail("MSC", "78.34", "23/04/2016"),new Employment("Techm", 2, "Allocate")));
		employeeList.add(new Employee("Richa", 27, "Developer",
				new EducationDetail("B.E", "88.88", "12/02/2016"), new Employment("Global Logic", 2, "New")));
		
		getEmployeeByDesignation(employeeList);
		getEmployeeByWorkDetail(employeeList);
		getEmployeeByExpirence(employeeList);
	}
	
	/**
	 * employees who are developers
	 * @param employeeList
	 */
	public static void getEmployeeByDesignation(List<Employee> employeeList ) {
		List<Employee> emp1 =  employeeList.stream()
				.filter(emp -> 
		emp.getDesignation().equals("Developer")).collect(Collectors.toList());
		emp1.forEach(System.out::println);
	}
	
	/**
	 * 
	 * @param employeeList
	 */
	public static void getEmployeeByWorkDetail(List<Employee> employeeList ) {
		List<Employee> empList = employeeList.stream().filter(emp -> 
		emp.getEmployment().getOrganizationName().equals("TCS")).collect(Collectors.toList());
		System.out.println(empList);
	}
	/**
	 * experience more than two years and are developers
	 * @param employeeList
	 */
	public static void getEmployeeByExpirence(List<Employee> employeeList ) {
		List<Employee> empList = employeeList.stream().
				filter(emp ->  emp.getDesignation().equals("Developer") && emp.getEmployment().getDuration()>=2)
				.collect(Collectors.toList());
		System.out.println(empList);
	}
	
}
