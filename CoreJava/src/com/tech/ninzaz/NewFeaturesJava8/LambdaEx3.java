package com.tech.ninzaz.NewFeaturesJava8;

interface Addable{
	public int add(int a, int b);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable doAddition = (a, b) ->{
			return a+b;
		};
		
		int i = doAddition.add(4, 5);
		System.out.println("Addition answer is: "+ i);
		
		Addable doAdd = (a, b) -> (a+b);		// if we are passing only one logic, we need not write return even
		
		i = doAdd.add(4, 6);
		System.out.println("Value is: "+ i);
	}

}
