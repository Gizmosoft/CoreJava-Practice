package com.accenture.lkm.lambdademo;

public class LambdaMain {

	public static void main(String[] args) {
		// Task 1
		/*
		 * Use lambda expression to provide implementation for method in Greetings
		 * functional interface Greet in more than one languages
		 */
		Greetings g = (language) ->{
			if(language=="English")
				System.out.println("Greetings in English - Hello!");
			else if(language=="Spanish")
				System.out.println("Greetings in Spanish - Hola!");
			else if(language=="Hindi")
				System.out.println("Greetings in Hindi - Namaste!");
			else
				System.out.println("Language Unknown!");
		};
		
		g.greet("English");
		g.greet("Spanish");
		g.greet("Hindi");
		g.greet("Russian");
		
		
		// Task 2
		/*
		 * Using lambda expression provide implementation for operation method in
		 * functional interface Calculator for computing product and remainder of two
		 * numbers
		 */
		
		Calculator product = (numberOne, numberTwo) ->{
			return numberOne*numberTwo;
		};
		int result = product.operation(3, 5);
		System.out.println("The product of two numbers is: "+ result);
		
		Calculator remainder = (numberOne, numberTwo) -> {
			if(numberOne>numberTwo)
				return numberOne%numberTwo;
			else
				return numberTwo%numberOne;
		};
		result = remainder.operation(3, 5);
		System.out.println("The remainder of two numbers is: "+ result);
	}
}
