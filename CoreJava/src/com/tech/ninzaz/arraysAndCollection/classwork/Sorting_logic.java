package com.tech.ninzaz.arraysAndCollection.classwork;

import java.util.Comparator;

import com.tech.ninzaz.arraysAndCollection.model.Employee;

public class Sorting_logic implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {		//emp1 and emp2 are local variables and can be named anything. We just have to use the same notations in the logic below...
		// TODO Auto-generated method stub
		return emp1.geteId() - emp2.geteId();
	}

}
