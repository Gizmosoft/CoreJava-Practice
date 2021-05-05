package com.accenture.lkm.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> myList = new HashSet<String>();
		myList.add("Boat headphone");
		myList.add("Jabra bluetooth headset");
		myList.add("Sam tamper glass");
		myList.add("Celio flip case");
		myList.add("Jabra bluetooth headset");
		System.out.println(myList);

		// for each
		for (String str : myList) {
			System.out.print(str + " ");
		}

		System.out.println("\nIn ascending order");
		TreeSet<String> sortedList = new TreeSet<String>(myList);
		Iterator<String> it = sortedList.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}

		System.out.println("\n Descending order");
		NavigableSet<String> desc = sortedList.descendingSet();
		for (String str : desc) {
			System.out.print(str + " ");
		}

	}

}
