package com.tech.ninzaz.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateWords {
	
public static void main(String[] args) {
	
	String s1 = "java again java objects classes objects";
	String[] names = s1.split(" ");
	List<String> str = new ArrayList<String>(Arrays.asList(names));
	
	for(String str1: str  ) {
		System.out.println(str1);
	}
	
	
}

}
