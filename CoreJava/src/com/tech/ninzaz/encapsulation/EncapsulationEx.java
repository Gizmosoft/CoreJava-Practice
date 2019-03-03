package com.tech.ninzaz.encapsulation;

public class EncapsulationEx {

	public static void main(String[] args) {
		
		/*Car has multiple parts and they are held together to form car */
		
		Car c1 = new Car();
		
		c1.setEngine("Maruthi Suzuki");
		c1.setSteerig("Branded Steering");
		c1.setWheels(4);

		
		System.out.println("CAR1 OBJECT: " + c1.toString());
		
		Car c2 = new Car();
		c2.setEngine("Toyota");
		c2.setSteerig("Branded Steering");
		c2.setWheels(6);
		
		Car c3 = new Car("Sterring", "Lamborghini", 4);
		System.out.println(c3.toString());
		
		System.out.println("CAR2 OBJECT: " +c2.toString());
		
		
	}

}
