package com.tech.ninzaz.NewFeaturesJava8;

public interface Interfacei1 {
	
	default void log(String str) {
		System.out.println("Logging "+ str);
	}

}
