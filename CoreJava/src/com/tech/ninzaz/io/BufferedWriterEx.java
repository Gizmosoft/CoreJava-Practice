package com.tech.ninzaz.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		File f = new File("C:/Temp/temp2.txt");
		FileWriter fw;
		BufferedWriter br;
		try {
			f.createNewFile();
			fw = new FileWriter(f);
			br = new BufferedWriter(fw);
			for (int j = 0; j < 100; j++) {
				br.write("Input String"+j);	
			}
			
			br.flush();
			br.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
	}

}
