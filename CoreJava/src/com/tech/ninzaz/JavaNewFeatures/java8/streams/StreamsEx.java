package com.tech.ninzaz.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamsEx {

	public static void main(String[] args) {
		
		
		String[] strs = new String[] {"aa", "bb", "cc", "dd"};
		Stream<String> streams= Arrays.stream(strs);
		
		streams.forEach(n->System.out.println(n));
		
		System.out.println("------------------------------------");
		
		Stream<String> streams2= Stream.of("ee", "ff", "gg");
		streams2.forEach(n->System.out.println(n));
		
		System.out.println("------------------------------------");
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "hh", "ii", "kk", "jj");
		Stream<String> stream3= list.stream().sorted();
		stream3.forEach(n->System.out.println(n));
		
		System.out.println("------------------------------------");
		List<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "Ramesh", "Lohith", "Gopal");
		
		Stream<String> streams4 = list1.stream().sorted();
		streams4.forEach(System.out::println);
		
	}

}
