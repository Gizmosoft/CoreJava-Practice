package com.accenture.lkm.sortlistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDatabaseMain {

	public static void main(String[] args) {
		Employee one = new Employee(1001, "Martin", 1200, 2);
		Employee two = new Employee(1002, "Linda", 1400, 3);
		Employee three = new Employee(1002, "Celina", 3000, 4);	// Will be shown first because it is added first
		Employee four = new Employee(1004, "Janet", 1600, 3);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(three);
		empList.add(one);
		empList.add(four);
		empList.add(two);
		
		EmployeeDatabase db = new EmployeeDatabase();
		
		// Sort by ID
		System.out.println("Sorted by Id");
		db.displayEmployeeDetailsSortedById(empList);
		
		// Sort by Salary
		System.out.println("\nSorted by Salary");
		ArrayList<Employee> sorted = db.displayEmployeeDetailsSortedBySalary(empList);
		// Code re-use by using this method
		printListUsingIterator(sorted);
		
//		Iterator<Employee> empIt = sorted.iterator();
//		while (empIt.hasNext()) {
//			Employee emp = empIt.next();
//			System.out.println(emp);
//		}
		
		
		/*
		 * invoke the methods displayEmployeeDetailsSortedByExperience and
		 * displayEmployeeDetailsSortedByName to display the output
		 */
		
		// Sort by Experience
		System.out.println("\nSorted by Experience");
		ArrayList<Employee> sortedExp = db.displayEmployeeDetailsSortedByExperience(empList);
		printListUsingIterator(sortedExp);
		
		// Sort by Name
		System.out.println("\nSorted by Name");
		ArrayList<Employee> sortedName = db.displayEmployeeDetailsSortedByName(empList);
		printListUsingIterator(sortedName);
	}
	
	// Reducing a lot of boiler plate code by implementing this
	public static void printListUsingIterator(ArrayList<Employee> objectName) {
		Iterator<Employee> it = objectName.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
