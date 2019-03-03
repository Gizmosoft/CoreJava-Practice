package com.tech.ninzaz.io;

import java.io.Console;
import java.util.Scanner;


public class ConsoleTest {
	public static void main(String[] args) {
		
		/*Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text: \n");
		
		int sum=0;
		
		String str = sc.nextLine();
		System.out.println("Input String is: "+ str);
		String[] strs= str.split(" ");
		
		for (String string : strs) {
			sum+=Integer.valueOf(string);
		}
		
		System.out.println("SUM is:"+ sum);
		
		
	}
}
