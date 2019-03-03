package com.tech.ninzaz.practice3;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
	public static void main(String args[]) {
	
	List l1 = new ArrayList();
		
		l1.add("Lohith");
		l1.add(2);
		
		for(Object o : l1) {
			if(o instanceof String) {
				System.out.println((String)o);
				
			}
			else if(o instanceof Integer) {
				System.out.println((Integer)o);
			}
			/*System.out.println(o);*/
		}
	}
	
}
