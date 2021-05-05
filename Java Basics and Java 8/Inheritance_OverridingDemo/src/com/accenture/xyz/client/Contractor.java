package com.accenture.xyz.client;

import com.accenture.xyz.payroll.Staff;

public class Contractor extends Staff {

	private String vendorName;
	private int numberOfHours;
	private final int RATE_PER_HOUR = 10;

	/**
	 * @param staffId
	 * @param staffName
	 * @param basic
	 */
	public Contractor(int staffId, String staffName, double basic, String vendorName, int numberOfHours) {
		super(staffId, staffName, basic);
		this.vendorName = vendorName;
		this.numberOfHours = numberOfHours;
	}

	public void printDetails() {
		System.out.println("Name " + staffName);
		System.out.println("Id " + staffId);
		System.out.println("Vendor name " + vendorName);
	}

	@Override
	public double computeNetSalary(boolean hasMealPass) {
		System.out.println("In contractor class");
		netSalary = basic + (numberOfHours * RATE_PER_HOUR);
		return netSalary;
	}

}
