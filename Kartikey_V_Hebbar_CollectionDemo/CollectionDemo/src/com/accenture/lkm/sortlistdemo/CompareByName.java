package com.accenture.lkm.sortlistdemo;

import java.util.Comparator;

/*
 * Implement comparator and override compare method
 * in order to compare by name
 */
public class CompareByName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// ascending order
		//return o1.getEmployeeName().compareTo(o2.getEmployeeName());

		// descending order
		if (o1.getEmployeeName().compareTo(o2.getEmployeeName()) < 0) {
			return 1;
		} else if (o1.getEmployeeName().compareTo(o2.getEmployeeName()) > 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
