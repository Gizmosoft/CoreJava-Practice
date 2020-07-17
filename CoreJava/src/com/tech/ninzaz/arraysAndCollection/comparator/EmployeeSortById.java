package com.tech.ninzaz.arraysAndCollection.comparator;

import java.util.Comparator;

import com.tech.ninzaz.arraysAndCollection.model.Employee;

public class EmployeeSortById implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		//Sort by ASCending order
		return emp1.geteId() - emp2.geteId();
	}

}


//Comparable is called in a POJO/model class whereas Comparator is written is a separate class.
//Comparable is used in only TreeMap and TreeSet but Comparator is used in any other Collection
//Comparator is used for creating Custom Sorting techniques and conditions.