package com.tech.ninzaz.JavaNewFeatures.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringAndMatchingEx {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Lohith");
		list.add("Gopal");
		list.add("Lohith");
		list.add("Ramesh");
		
		
		//Filtering
		Stream<String> filteredList = list.stream().filter(e->e.contains("L"));
		filteredList.forEach(System.out::println);
		
		//Matching
		boolean anyMatch = list.stream().anyMatch(s->s.contains("Lohith"));
		System.out.println(anyMatch);
		
		anyMatch = list.stream().anyMatch(s->s.contains("Lohiht"));
		System.out.println(anyMatch);
		
		
		
	}

}
