package com.accenture.lkm.io.objectstream.solutions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserialization {
	// TODO 1. Create an instance of ObjectInputStream
	// and chain it with FileInputStream

	// TODO 2. Create a reference variable of type Person

	// TODO 3. invoke readObject method on instance of ObjectInputStream and
	// assign it to Person object

	// TODO 4. print the person object
	public static void readPerson(String fileName) {
		try (FileInputStream fin = new FileInputStream(fileName);
				ObjectInputStream oin = new ObjectInputStream(fin);) {
			Person e = (Person) oin.readObject();
			System.out.println(e.toString());
		} catch (IOException | ClassNotFoundException io) {
			System.out.println(io.getMessage());

		}

	}

	public static void main(String[] args) {

		readPerson("src/files/Person.dat");

	}
}
