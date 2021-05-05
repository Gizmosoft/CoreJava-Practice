package com.accenture.xyz.payroll;

//sub class
public class Employee extends Staff {

	private String department;
	private String location;

	public Employee(String department,String location,
			int staffId, String staffName, double basic) {
		super(staffId,staffName,basic);
		this.department=department;
		this.location=location;
	}

	public void displayEmployeeDetails() {
		System.out.println("Department " + department);
		System.out.println("Location " + location);
		System.out.println("Employee id " + staffId);
		System.out.println("Employee name " + staffName);
	}

}
