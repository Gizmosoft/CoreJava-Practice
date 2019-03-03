package com.tech.ninzaz.singleton;

public class SingletonEx {

	public static void main(String[] args) {
		
		try {
			
			
/*			Employee e1 = new Employee(1, "Saurabh");
			System.out.println(e1.toString());
			Employee e2 = new Employee(2, "Rahul");
			System.out.println(e2.toString());
			Employee e3 = new Employee(3, "Pragathi");
			System.out.println(e3.toString());
			Employee e4 = new Employee(4, "Lohith");
			System.out.println(e4.toString());
			Employee e5 = new Employee(5, "Gopal");
			System.out.println(e5.toString());
			Employee e6 = new Employee(6, "Should not be created");
			System.out.println(e6.toString());*/
			
			Employee e1 = null;
			e1 = e1.getObject();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
