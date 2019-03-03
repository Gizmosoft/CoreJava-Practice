package com.tech.ninzaz.polymorphism;

public class PolymorphismEx {

	public static void main(String[] args) {
	
		SoftwareEngineer s1 = new SoftwareEngineer();
		s1.doTask();
		System.out.println(s1.task);
		
		SoftwareEngineer s2 = new TestEngineer();
		s2.doTask(); //this is runtime polymorphism
		System.out.println(s2.task);
		
	}

}
