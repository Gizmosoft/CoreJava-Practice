package com.tech.ninzaz.NewFeaturesJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachOnList {

	public static void main(String[] args) {
	
		List<String> l1 = new ArrayList<>();
		l1.add("Kartikey");
		l1.add("Lohith");
		l1.add("Ankit");
		
		MyConsumer action = new MyConsumer();
		l1.forEach(System.out::println);		//New Print technique in ForEach using Lambda Exp.
		
		List<String> l2 = new ArrayList<>();
		l2.add("10");
		l2.add("20");
		
		l2.forEach(action);
		
		Map<Integer, String> m = new HashMap<>();
		m.put(100, "Java");
		m.put(200, "Python");
		m.put(300, "JS");
		
		m.forEach(
				(k,v)-> System.out.println(k+ " "+v)
				);
		
		} 
	
	

	
	
}
class MyConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
}


