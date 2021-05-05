package com.accenture.lkm.exceptions.checked;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatch {
	public static void write(String fileName) {
		// TODO 1. create a FileWriter object in append mode by passing fileName as argument
		FileWriter fw;
		try {
			fw = new FileWriter(fileName, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		write("src/files/users.txt");
	}
}
