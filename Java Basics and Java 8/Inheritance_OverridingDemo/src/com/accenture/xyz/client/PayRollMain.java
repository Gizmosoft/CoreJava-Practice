package com.accenture.xyz.client;

import com.accenture.xyz.payroll.Employee;
import com.accenture.xyz.payroll.Staff;

public class PayRollMain {

	public static void main(String[] args) {

		Staff staff = new Staff(101, "Fred", 18000);
		double salary = staff.computeNetSalary(true);
		System.out.println("Net salary is " + salary);

		Employee emp = new Employee("201", "KDC", 102, "Linda", 21000);
		emp.displayEmployeeDetails();
		salary = emp.computeNetSalary(true);
		System.out.println("Net salary is " + salary);

		Contractor cont = new Contractor(301, "Celina", 8000, "Kelly services", 90);
		salary = cont.computeNetSalary(false);
		System.out.println("Net salary is " + salary);
		cont.printDetails();

	}

}
