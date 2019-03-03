package com.tech.ninzaz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		char[] in = new char[100];
		File f = null;
		FileReader fr = null;
		
		try {
			f = new File("C:\\Temp\\temp.txt");
			fr = new FileReader(f );
			
			fr.read(in);
			
			for (char c : in) {
				System.out.println(c);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			fr.close();
		}
		
		
		
		
	}

}
