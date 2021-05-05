package com.accenture.xyz.client;

import com.accenture.xyz.payroll.Staff;

public class Contractor extends Staff {

	private String vendorName;
	
	

	/**
	 * @param staffId
	 * @param staffName
	 * @param basic
	 */
	public Contractor(int staffId, String staffName, 
			double basic,String vendorName) {
		super(staffId, staffName, basic);
		this.vendorName=vendorName;
	}

	public void printDetails() {
		System.out.println("Name " + staffName);
		System.out.println("Id " + staffId);
		System.out.println("Vendor name "+vendorName);
	}

}
