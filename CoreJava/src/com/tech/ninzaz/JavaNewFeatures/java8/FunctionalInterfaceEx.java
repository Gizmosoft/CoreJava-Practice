package com.tech.ninzaz.java8;

@FunctionalInterface
public interface FunctionalInterfaceEx {

	public	default void m1() {
		System.out.println("In M1");
	}
	
	public static void m2() {
		System.out.println("IN M2");
	}
	
	public static void m3() {
		System.out.println("IN M2");
	}
	
	
	public void method1();
	
	//public void method2();
	
	
}
