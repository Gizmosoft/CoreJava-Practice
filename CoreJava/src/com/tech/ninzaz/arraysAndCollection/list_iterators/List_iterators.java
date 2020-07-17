package com.tech.ninzaz.arraysAndCollection.list_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterators {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Lohith");
		l1.add("Gopal");
		l1.add("Lohith");
		l1.add(null);
		l1.add(null);
		
		l1.add(0, "Ramesh");
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("Traversing a list using ListIterator");
		ListIterator<String> it1 = l1.listIterator(3);
		while(it1.hasNext()) {
			String str = it1.next();
			System.out.println(str);
		}
		System.out.println("Reverse traversing using ListeIterator");
		while(it1.hasPrevious()) {
			System.out.println(it1.previous());
		}
	}
}
