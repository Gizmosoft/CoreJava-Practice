package com.accenture.lkm.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Boat headphone");
		myList.add("Jabra bluetooth headset");
		myList.add("Sam tamper glass");
		myList.add("Celio flip case");
		myList.add("Jabra bluetooth headset");

		System.out.println(myList);

		System.out.println("My wish list");
		// for loop
		for (int i = 0; i < myList.size(); i++) {
			String item = myList.get(i);
			System.out.print(item.toUpperCase() + " ");
		}

		myList.add(4, "11D tamper glass");
		System.out.println("\nAfter adding at an index");
		// for each
		for (String item : myList) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
		System.out.println("After removal");
		String removedItem = myList.remove(4);
		System.out.println(removedItem);

		myList.set(2, "Celio tamper glass");
		System.out.println("After replacement");
		// Iterator
		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.print(item + " ");
		}

	}

}
