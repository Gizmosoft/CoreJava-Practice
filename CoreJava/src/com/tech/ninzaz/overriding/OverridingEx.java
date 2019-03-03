package com.tech.ninzaz.overriding;

import java.io.IOException;

public class OverridingEx {

	public static void main(String[] args) {
		
		try {
		Animal a = new Animal();			
		a.eat();
		a.run();
		System.out.println(a.name);
		System.out.println();
		
		Animal a1 = new Horse();
		a1.eat();
		a1.run();
		//a1.run(60); //can not have this overloaded method since Animal reference
		//a1.sleep();
		System.out.println(a1.name);
		System.out.println();
		
		
		Horse h = new Horse();
		h.eat();
		h.run();
		h.run(40);
		System.out.println(h.name);
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
