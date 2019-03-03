package com.tech.ninzaz.NewFeaturesJava7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesEx {

	public static void main(String[] args) {
		//testTryWithResPreJava7();
		testTryWithResJava7();
		

	}

	public static void testTryWithResPreJava7(){
		FileInputStream in = null;
		try {
			in = new FileInputStream("java7.txt");
			System.out.println(in.read());
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void testTryWithResJava7() {
		try (FileInputStream in = new FileInputStream("java7.txt")){
			System.out.println(in.read());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
