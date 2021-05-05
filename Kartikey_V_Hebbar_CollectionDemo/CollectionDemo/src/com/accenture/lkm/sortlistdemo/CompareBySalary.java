package com.accenture.lkm.sortlistdemo;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// ascending order
//		if (o1.getSalary() > o2.getSalary()) {
//			return 1;
//		} else if (o1.getSalary() < o2.getSalary()) {
//			return -1;
//		} else {
//			return 0;
//		}

		// descending order
		if (o1.getSalary() < o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() > o2.getSalary()) {
			return -1;
		} else {
			return 0;
		}

	}

}
