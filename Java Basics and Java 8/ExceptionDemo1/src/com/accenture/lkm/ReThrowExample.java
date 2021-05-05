package com.accenture.lkm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReThrowExample {
public static void main(String[] args) {
	division();
}

public static void division() {
	int num1, num2, result=0;
	try(Scanner s = new Scanner(System.in)) {
	System.out.println("Enter Number1");
	num1 = s.nextInt();
	System.out.println("Enter Number2");
	num2 = s.nextInt();
	result = num1/num2;
	}
	catch(InputMismatchException | ArithmeticException e){
		throw e;
	}
	System.out.println(result);
}
}
