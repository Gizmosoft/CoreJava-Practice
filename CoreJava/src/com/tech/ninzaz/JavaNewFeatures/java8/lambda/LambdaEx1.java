package com.tech.ninzaz.java8.lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		
	
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable in old way");
			}
		};
		
		
		Runnable r2 = ()->{System.out.println("Runnable using Lambda");};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
	
	

}
