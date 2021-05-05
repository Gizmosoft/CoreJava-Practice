package com.accenture.lkm.iodemo.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//De-serialization
public class ObjectReadDemo {

	public static void main(String[] args) {

		try (FileInputStream fInput = new FileInputStream("c:\\iodemo\\traineedetails.txt");
				ObjectInputStream objIn = new ObjectInputStream(fInput);) {
			Trainee trainee = (Trainee) objIn.readObject();
			System.out.println(trainee);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
