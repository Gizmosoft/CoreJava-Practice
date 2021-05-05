package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
public static void main(String[] args) {
	try(FileReader fr = new FileReader("abc.txt")) {
		fr.read();
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(IOException e1) {
		System.out.println(e1.getMessage());
	}
}
}
