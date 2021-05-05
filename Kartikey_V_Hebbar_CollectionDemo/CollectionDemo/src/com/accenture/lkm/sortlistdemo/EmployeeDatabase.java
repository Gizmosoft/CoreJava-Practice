package com.accenture.lkm.sortlistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDatabase {

	public void displayEmployeeDetailsSortedById(ArrayList<Employee> empList) {
		Collections.sort(empList);
		for (Employee employee : empList) {
			System.out.println(employee);

		}
	}

	public ArrayList<Employee> displayEmployeeDetailsSortedBySalary(ArrayList<Employee> empList) {
		Collections.sort(empList, new CompareBySalary());
		return empList;
	}

	// To sort by employee years of experience
	public ArrayList<Employee> displayEmployeeDetailsSortedByExperience(ArrayList<Employee> empList) {
		Collections.sort(empList, new CompareByExperience());
		return empList;
	}

	// To sort by employee name
	public ArrayList<Employee> displayEmployeeDetailsSortedByName(ArrayList<Employee> empList) {
		Collections.sort(empList, new CompareByName());
		return empList;
	}

}
