package com.accenture.lkm.io.objectstream.solutions;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Person implements Serializable {

	private static final long serialVersionUID = 3040037688942134461L;
	private int id;
	private String name;
	private String email;

	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
