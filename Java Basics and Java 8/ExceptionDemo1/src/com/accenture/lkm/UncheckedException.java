package com.accenture.lkm;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
public static void main(String[] args) {
	
	int num1, num2, result=0;
	try(Scanner s = new Scanner(System.in)) {
	System.out.println("Enter Number1");
	num1 = s.nextInt();
	System.out.println("Enter Number2");
	num2 = s.nextInt();
	result = num1/num2;
	}
	catch(InputMismatchException e)	{
		System.out.println(e.getMessage());
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
//	finally {
//		s.close();
//	}
//	catch(InputMismatchException | ArithmeticException e)
//	{
//		System.out.println(e.getMessage());
//	}
		
	System.out.println("Result is "+result);
	System.out.println("Welcome to Exception Handling");
}
}


// JDK 7 - a single catch to handle multiple exceptions
// Exceptions should be in the same class level in the Hierarchy
