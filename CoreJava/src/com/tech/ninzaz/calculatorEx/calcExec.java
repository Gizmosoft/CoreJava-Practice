package com.tech.ninzaz.calculatorEx;

public class calcExec {
	
	public static void main(String[] args) {
		calculator calc = new scientificCalc();
		int sum= calc.add(3, 5);	
		System.out.println(sum);		
	}

}
