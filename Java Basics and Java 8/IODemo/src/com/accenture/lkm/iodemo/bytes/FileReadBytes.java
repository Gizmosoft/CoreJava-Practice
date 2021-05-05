package com.accenture.lkm.iodemo.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadBytes {

	public static void main(String[] args) {

		// try with resources
		try (FileInputStream fIn =
				new FileInputStream("TechversantAcademy.txt")) {
			int i;
			while ((i = fIn.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
