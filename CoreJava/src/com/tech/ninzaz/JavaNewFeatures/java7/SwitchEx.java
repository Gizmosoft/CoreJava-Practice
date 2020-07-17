package com.tech.ninzaz.JavaNewFeatures.java7;

public class SwitchEx {

	public static void main(String[] args) {
		
		testStringInSwitchPreJava7("Java 6");
		testStringInSwitchJava7("Java 7");
		
	}
	
	public static void testStringInSwitchPreJava7(String param){
	       final String JAVA5 = "Java 5";
	       final String JAVA6 = "Java 6";
	       final String JAVA7 = "Java 7";
	       if (param.equals(JAVA5)){
	           System.out.println(JAVA5);
	       } else if (param.equals(JAVA6)){
	           System.out.println(JAVA6);
	       } else if (param.equals(JAVA7)){
	           System.out.println(JAVA7);
	       }else{
	    	   System.out.println("NO JAVA");
	       }
	}
	
	public static void testStringInSwitchJava7(String param) {
		
	      final String JAVA5 = "Java 5";
	       final String JAVA6 = "Java 6";
	       final String JAVA7 = "Java 7";
	      
	       switch (param) {
	           case JAVA5:
	               System.out.println(JAVA5);
	               break;
	           case JAVA6:
	               System.out.println(JAVA6);
	               break;
	           case JAVA7:
	               System.out.println(JAVA7);
	               break;
	       }
		
	}

}
