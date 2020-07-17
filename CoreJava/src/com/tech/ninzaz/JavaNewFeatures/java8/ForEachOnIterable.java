package com.tech.ninzaz.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachOnIterable {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		
		usingIterable(l1);
		usingIterableForEach(l1);
	}


	private static void usingIterable(List<Integer> l1) {
		
		System.out.println("PREVIOUS TO THAT OF JAVA 8");
		Iterator<Integer> it= l1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	private static void usingIterableForEach(List<Integer> l1) {
		System.out.println("IN JAVA 8");
		MyConsumer action = new MyConsumer();
		l1.forEach(action);
	}

	
}

class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}
