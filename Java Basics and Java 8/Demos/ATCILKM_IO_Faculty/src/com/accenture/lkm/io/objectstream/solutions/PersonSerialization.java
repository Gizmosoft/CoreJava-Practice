package com.accenture.lkm.io.objectstream.solutions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerialization {

	// TODO 1. Create an instance of FileOutputStream in append mode by passing
	// fileName as an argument to FileOutputStream constructor

	// TODO 2. Create an instance of ObjectOutputStream and
	// chain it with FileOutputStream

	// TODO 3. invoke writeObject method on instance of ObjectOutputStream and
	// pass person as argument to persist in Person.dat file

	public static void savePerson(String fileName, Person person) {
		try (FileOutputStream fout = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fout);) {
			oos.writeObject(person);
			System.out.println("Object saved");
		} catch (IOException io) {
			System.out.println(io.getMessage());

		}

	}

	public static void main(String[] args) {

		Person person = new Person(100, "John", "john@gmail.com");
		savePerson("src/files/Person.dat", person);

	}
}
