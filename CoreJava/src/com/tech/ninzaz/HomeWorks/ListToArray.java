package com.tech.ninzaz.HomeWorks;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Kartikey");
		list.add("Ankit");
		list.add("Rajat");
		String names[]=list.toArray(new String[list.size()]);
		System.out.println(list.toArray(names));

	}

}
