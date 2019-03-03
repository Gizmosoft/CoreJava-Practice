package com.tech.ninzaz.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEx {

	public static void main(String[] args) {
		
		try {
			readFile("C:/ABC.txt");
		
		}
		catch(FileNotFoundException e){
			System.out.println("INSIDE FILE NOT FOUND: " + e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("INSIDE IO EXCEPTION: "+ e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception Blok");
		}
		finally{
			System.out.println("Inside Finally: Closing the file here");
		}
		//Move this between try, catch and finally
		System.out.println();
		
		
		try {
			readFile("C:/ABC.txt");
		} catch (IOException | MyCustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readFile(String fileName) throws IOException, MyCustomException{
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        br.readLine();
		
	}

}
