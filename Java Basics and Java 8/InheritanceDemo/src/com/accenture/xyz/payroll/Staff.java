package com.accenture.xyz.payroll;

//super class
public class Staff {

	protected int staffId;
	protected String staffName;
	private double netSalary;
	private double basic;

	/**
	 * @param staffId
	 * @param staffName
	 * @param basic
	 */
	public Staff(int staffId, String staffName, double basic) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.basic = basic;
	}

	public double computeNetSalary(boolean hasMealPass) {
		double rentAllowance = 0.15 * basic;
		double travelAllowance = 0.05 * basic;
		netSalary = basic + rentAllowance + travelAllowance;
		if (hasMealPass) {
			netSalary = netSalary + 2200;
		}
		return netSalary;

	}

}
