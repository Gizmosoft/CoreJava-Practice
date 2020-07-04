package com.tech.ninzaz.NewFeaturesJava8;

public interface Interfacei2 {
	default void log(String str) {
		System.out.println("Logging 2 "+ str);
	}
}
