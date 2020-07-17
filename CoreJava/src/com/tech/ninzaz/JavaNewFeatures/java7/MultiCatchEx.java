package com.tech.ninzaz.java7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchEx {

	public static void main(String[] args) {
		
		testMultiCatchPreJava7();
		testMultiCatchJava7();
		
	}

	public static void testMultiCatchPreJava7(){
	     try {
	         throw new FileNotFoundException("FileNotFoundException");
	     } catch (FileNotFoundException fnfo) {
	         fnfo.printStackTrace();
	     } catch (IOException ioe) {
	         ioe.printStackTrace();
	     }
	}
	
	@SuppressWarnings("unused")
	public static void testMultiCatchJava7(){
		 try {
			 if(1==2){
		      throw new FirstException("FileNotFoundException");
			 } else{
			  throw new SecondException("Second Exception");
			 }
		 }catch(FirstException | SecondException fnfo) {
		       fnfo.printStackTrace();
		 }
		
	}
	
}


class FirstException extends Exception {

	public FirstException(String msg) {
		super(msg);
	}
}

class SecondException extends Exception {

	public SecondException(String msg) {
		super(msg);
	}
}