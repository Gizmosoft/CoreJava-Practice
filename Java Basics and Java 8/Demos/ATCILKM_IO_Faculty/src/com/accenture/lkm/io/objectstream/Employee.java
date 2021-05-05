package com.accenture.lkm.io.objectstream;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Employee implements Serializable {

	private static final long serialVersionUID = 3040037688942134461L;
	private int id;
	private String name;
	private LocalDate dob;
	private transient int age;
	private static String companyName;

	static {
		companyName = "Accenture";
	}

	// setter and geter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

}
