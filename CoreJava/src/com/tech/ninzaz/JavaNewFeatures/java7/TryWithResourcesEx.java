package com.tech.ninzaz.JavaNewFeatures.java7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesEx {

	public static void main(String[] args) {

		try {
			//testTryWithResPreJava7();
			testTryWithResJava7();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void testTryWithResPreJava7() throws FileNotFoundException, IOException{
	     FileInputStream in = null;
	    try {
	        in = new FileInputStream("java7.txt");
	        byte[] b = new byte[32*1024];
	        
	        System.out.println( in.read());
	        
	    } finally {
	        if (in != null) {
	            in.close();
	        }
	    }
	}
	
	public static void testTryWithResJava7() throws FileNotFoundException, IOException{
	    try (FileInputStream in = new FileInputStream("java7.txt")) {
	        System.out.println(in.read());
	    }
	}
	
}
