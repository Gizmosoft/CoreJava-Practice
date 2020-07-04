package com.tech.ninzaz.polymorphism;

public class PolymorphismEx {

	public static void main(String[] args) {
	
		SoftwareEngineer s1 = new SoftwareEngineer();
		s1.doTask();
		System.out.println(s1.task);
		
		TestEngineer s2 = new TestEngineer();
	//	SoftwareEngineer s2 = new TestEngineer(); //this is runtime polymorphism
		s2.doTask(); 
		System.out.println(s2.task);
		
	}

}
