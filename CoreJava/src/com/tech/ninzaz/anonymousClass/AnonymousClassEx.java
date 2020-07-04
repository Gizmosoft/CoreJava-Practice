package com.tech.ninzaz.anonymousClass;

class A{
	public void show(){
		System.out.println("in A show");
	}
}

class B extends A{
	public void show(){			// Method Overriding
		System.out.println("in B show");
	}
}

public class AnonymousClassEx {

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.show(); 			// Returns "in A show"
		
		A obj2 = new B();
		obj2.show(); 			// Returns "in B show"
		
		// To return "in B show" from object of A, we need to create Anonymous Class
		
		A obj3 = new A(){
			public void show(){			// Method inside Anonymous Class
				System.out.println("in B show");
			}
		};
		obj3.show();			// Returns "in B show"
	}

}
