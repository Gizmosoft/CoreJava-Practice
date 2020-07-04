package com.tech.ninzaz;

public class A {

	protected String aid;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		try {
			//Class.forName("com.tech.B");
			B b = new B();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
