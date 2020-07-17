package com.tech.ninzaz.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachOnList {

	public static void main(String[] args) {
		 
		List<String> list=new ArrayList<>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        
	        
	        System.out.println("Previous to Java 8");
	        for (String str : list) {
				System.out.println(str);
			}
	        
	        System.out.println("Using Java 8 - Lambda Expressions");
	        list.forEach(  
	            (n)->{
	            		System.out.println(n);
	            	}  
	        );  
	        
	        
	}

}
