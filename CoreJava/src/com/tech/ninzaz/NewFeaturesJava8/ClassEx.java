package com.tech.ninzaz.NewFeaturesJava8;

public class ClassEx implements Interfacei1, Interfacei2 {

//	@Override
//	public void log(String str) {
//		System.out.println("logginnngggg" + str);
//	}
	
	public static void main(String[] args) {
		ClassEx e1 = new ClassEx();
		e1.log("temp");
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interfacei2.super.log(str);
	}
	
}
