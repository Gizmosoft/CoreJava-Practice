package com.accenture.lkm.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> batchList = new HashMap<Integer, String>(4);
		int rollNo = 101;
		batchList.put(rollNo, "Fred"); // auto-boxing
		batchList.put(102, "Linda");
		batchList.put(103, "Melinda");
		batchList.put(104, "Celina");
		batchList.put(105, "Catherine");
		batchList.put(103, "Kevin");// key must be unique

		// batchList.put(null, "Joe");// null key
		// batchList.put(null, null); // null key and null value

		System.out.println(batchList);

		TreeMap<Integer, String> sortedBatch = new TreeMap<Integer, String>(batchList);
		System.out.println(sortedBatch);

		System.out.println("Roll no \t Name");
		Set<Integer> keySet = sortedBatch.keySet();
		for (Integer item : keySet) {
			String value = sortedBatch.get(item);
			System.out.println(item + "\t\t" + value);
		}

		System.out.println("In descending order");
		System.out.println("Roll no \t Name");
		Set<Integer> descKey = sortedBatch.descendingKeySet();
		for (Integer item : descKey) {
			String value = sortedBatch.get(item);
			System.out.println(item + "\t\t" + value);
		}
		System.out.println("Using iterator");
		Set<Integer> keys = sortedBatch.keySet();
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			int key = it.next(); // auto-unboxing
			String value = sortedBatch.get(key);
			System.out.println(key + "\t\t" + value);
		}

		String age = "23";
		int personAge = Integer.parseInt(age);// auto-unboxing
		if (personAge > 60) {

		}

	}

}
