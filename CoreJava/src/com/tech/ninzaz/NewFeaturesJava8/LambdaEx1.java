package com.tech.ninzaz.NewFeaturesJava8;

public class LambdaEx1{					// We don't require to write implements Runnable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {					//Implementing Runnable Interface
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable in old way");
		}
	};
	
	Runnable r2 = () ->{System.out.println("Runnable using Lambda");};		//Implementing Runnable Interface Using Lambda Expression
	
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	
	t1.start();
	t2.start();
}

}
