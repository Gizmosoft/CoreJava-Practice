package com.accenture.lkm.exceptions.errors;

public class StackOverflowErrorEx {

	public static void main(String[] args) {
		//TODO 1. invoke factorial method
		factorial(5);
	}

	public static int factorial(int n) {
		return n * factorial((n - 1));
	}

}
