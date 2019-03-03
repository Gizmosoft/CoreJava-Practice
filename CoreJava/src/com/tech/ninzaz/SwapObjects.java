package com.tech.ninzaz;

import com.tech.ninzaz.encapsulation.Car;

/*Lohith Gopal
 * 
 * Demonstrate PassByValue
 * 
 * */
public class SwapObjects {
	
	

	public static void main(String[] args) {
		A a = new A();
		a.aid ="String 1";

		
		
		Car c1 = new Car("Steering", "Merc", 4);
		Car c2 = new Car("Steering 2", "Maruthi Suzuki", 4);
		System.out.println("Before Swaping");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		swap(c1, c2);
		
		System.out.println();
		System.out.println("After Swaping");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

	private static void swap(Car c1, Car c2) {
		
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		
		CarWrapper temp = cw1;
		cw1 = cw2;
		cw2= temp;
		
		
	}

}
