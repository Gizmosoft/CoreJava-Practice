package com.tech.ninzaz.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEachOnMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new HashMap<>();
		map.put(100, "Lohith");
		map.put(200, "Gopal");
		map.put(300, "Ramesh");
		map.put(400, "Anand");
		
		map.forEach( 
				(k, v)->System.out.println("Employee ID "+ k + " Employee Name "+ v)
				);
		
	}

}
