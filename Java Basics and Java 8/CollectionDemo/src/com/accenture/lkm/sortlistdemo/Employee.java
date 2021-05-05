package com.accenture.lkm.sortlistdemo;

public class Employee implements Comparable<Employee> {

	private int employeeId;
	private String employeeName;
	private double salary;
	private int yearsOfExperience;

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param salary
	 * @param yearsOfExperience
	 */
	public Employee(int employeeId, String employeeName, double salary, int yearsOfExperience) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public int compareTo(Employee o) {
		// ascending order
//		if (this.employeeId > o.employeeId) {
//			return 1;
//		} else if (this.employeeId < o.employeeId) {
//			return -1;
//		} else {
//			return 0;
//		}
		// descending order
		if (this.employeeId < o.employeeId) {
			return 1;
		} else if (this.employeeId > o.employeeId) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", yearsOfExperience=" + yearsOfExperience + "]";
	}

}
