package com.accenture.lkm.io.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {
	public static void readEmployee() {
		try (FileInputStream fin = new FileInputStream("src/files/Employee.dat");
				ObjectInputStream oin = new ObjectInputStream(fin);) {
			Employee e = (Employee) oin.readObject();
			System.out.println(e.toString());
		} catch (IOException | ClassNotFoundException io) {
			System.out.println(io.getMessage());

		}

	}

	public static void main(String[] args) {
		readEmployee();
	}
}
