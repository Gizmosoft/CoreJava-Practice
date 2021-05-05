package com.accenture.lkm.sortlistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDatabaseMain {

	public static void main(String[] args) {
		Employee one = new Employee(1001, "Martin", 1200, 2);
		Employee two = new Employee(1002, "Linda", 1400, 3);
		Employee three = new Employee(1002, "Celina", 3000, 4);
		Employee four = new Employee(1004, "Janet", 1600, 3);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(three);
		empList.add(one);
		empList.add(four);
		empList.add(two);

		EmployeeDatabase db = new EmployeeDatabase();
		db.displayEmployeeDetailsSortedById(empList);
		System.out.println("Sorted by salary");
		ArrayList<Employee> sorted = db.displayEmployeeDetailsSortedBySalary(empList);
		Iterator<Employee> empIt = sorted.iterator();
		while (empIt.hasNext()) {
			Employee emp = empIt.next();
			System.out.println(emp);
		}
		/*
		 * invoke the methods displayEmployeeDetailsSortedByExperience and
		 * displayEmployeeDetailsSortedByName to display the output
		 */
	}

}
