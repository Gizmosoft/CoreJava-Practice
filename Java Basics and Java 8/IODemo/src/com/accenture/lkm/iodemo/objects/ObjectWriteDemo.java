package com.accenture.lkm.iodemo.objects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectWriteDemo {

	// serialization
	public static void main(String[] args) {
		try (FileOutputStream fOut = new FileOutputStream("c:\\iodemo\\traineedetails.txt", true);
				ObjectOutputStream objOut = new ObjectOutputStream(fOut);) {
			Trainee trainee = new Trainee("Trump", 21, new Date());
			objOut.writeObject(trainee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Object written successfully");

	}

}
