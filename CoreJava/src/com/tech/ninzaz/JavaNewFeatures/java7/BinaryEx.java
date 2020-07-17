package com.tech.ninzaz.java7;

public class BinaryEx {

	public static void main(String[] args) {
		
	        int binary = 0b1010; //(2^0)*0 + (2^1)* 1 + (2^2)* 0 + (2^3)*1
	        if (binary == 10){
	            System.out.println(true);
	        } else{
	            System.out.println(false);
	        }
	
	        
	        //Underscores between literals
	        
	        int a = 10_00_000;
	        int b = 1000000;
	        
	        if(a==b){
	        	System.out.println(true);
	        }else {
	        	System.out.println(false);
	        }
	        
	}

}
