package com.accenture.lkm;

import java.io.FileReader;
import java.io.IOException;

public class ReThrowException1 {
public static void main(String[] args) {
	try {
	readFromFile();
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
}

public static void readFromFile() throws IOException{
	try(FileReader fr = new FileReader("abc.txt")){
		fr.read();
	}catch(IOException e) {
		throw e;
	}
}
}
//HandleOrDeclare