package com.accenture.lkm.io.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.LocalDate;

public class EmployeeSerialization {
	public static void saveEmployee(Employee e) throws IOException {
		try (FileOutputStream fout = new FileOutputStream("src/files/Employee.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fout);) {
			oos.writeObject(e);
			System.out.println("Object saved");
		}

	}

	public static void main(String[] args) throws IOException {
		Employee e = getEmp();
		saveEmployee(e);
	}

	private static Employee getEmp() {
		 
		Employee e = new Employee();
		e.setId(100);
		e.setName("John");
		LocalDate dob = LocalDate.of(1990, 01, 01);

		e.setDob(dob);

		e.setAge(calculateAge(dob));
 		return e;
	}

	private static int calculateAge(LocalDate dob) {
		LocalDate today = LocalDate.now();
		Duration duration = Duration.between(dob.atStartOfDay(), today.atStartOfDay());
		return (int) Math.abs(duration.toDays());
	}

}
