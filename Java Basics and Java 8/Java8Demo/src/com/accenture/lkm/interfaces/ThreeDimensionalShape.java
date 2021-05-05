package com.accenture.lkm.interfaces;

@FunctionalInterface
public interface ThreeDimensionalShape {

	void computeVolume();

	static void applyColor(String color) {
		System.out.println(color + " applied");
	}

	default void enlarge() {
		System.out.println("enlarged");
	}

	static void rotate(String direction) {
		System.out.println("rotated " + direction);
	}

	default void erase() {
		System.out.println("erased");
	}
}
