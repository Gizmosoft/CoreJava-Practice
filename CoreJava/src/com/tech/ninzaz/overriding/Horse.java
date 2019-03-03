package com.tech.ninzaz.overriding;

import java.io.FileNotFoundException;

public class Horse extends Animal {
	
	public String name = "Horse";
	
	@Override
	public void eat() throws FileNotFoundException{
		System.out.println("Horse eating");
	}
	
	//Overloading
	public void run(int speed){
		System.out.println("Horse Running with 4 legs" + speed);
	}
	
	public void sleep(){
		System.out.println("Horse Sleeping");
	}
	
}
