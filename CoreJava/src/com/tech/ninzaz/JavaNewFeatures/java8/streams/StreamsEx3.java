package com.tech.ninzaz.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsEx3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Lohith");
		list.add("Gopal");
		list.add("Lohith");
		list.add("Ramesh");
		
		int count= (int) list.stream().count();
		System.out.println("Initial Count is: "+ count);
		
		//intermediate and terminal operations
		count = (int) list.stream().distinct().count();
		System.out.println("Distinct count is: "+ count);
		

		
	}

}
