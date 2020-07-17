package com.tech.ninzaz.java8.lambda;

interface Addable{
	public int add(int a, int b);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		
		Addable doAddition = (a, b)->{
			return a+b;
		};
		
		int i = doAddition.add(4, 5);
		System.out.println("Value after addition is "+i);
		
		Addable doAdd = (a, b)->(a+b);
		
		i = doAdd.add(4, 6);
		System.out.println("Value after Add is "+ i);
		
		
	}

}
