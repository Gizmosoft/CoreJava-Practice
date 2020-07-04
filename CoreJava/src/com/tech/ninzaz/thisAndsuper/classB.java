package com.tech.ninzaz.thisAndsuper;

public class classB extends classA {
	private String dob;
	public void run(){
		this.dob = "StringOne";
		super.id = 1;
		super.name = "Gizmosoft";
		System.out.println(id +" "+ name +" "+ dob);
	}

}
