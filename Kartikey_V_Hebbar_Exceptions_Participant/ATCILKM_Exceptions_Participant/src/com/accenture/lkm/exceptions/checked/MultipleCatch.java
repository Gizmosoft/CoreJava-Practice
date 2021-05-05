package com.accenture.lkm.exceptions.checked;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MultipleCatch {
	public static void write() {
		// note : Access the drive that does not exist
		// TODO 1. Application will raise FileNotFoundException
		// TODO 2. handle FileNotFoundException
		// TODO 3. change the file name to src/files/users.txt
		FileWriter fw;
		try {
			fw = new FileWriter("src/files/users.txt", true);
			fw.write("john@gmail.com");
			fw.write(System.lineSeparator());
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		write();

	}
}
