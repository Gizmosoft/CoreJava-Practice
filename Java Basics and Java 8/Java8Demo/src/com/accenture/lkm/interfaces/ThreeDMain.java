package com.accenture.lkm.interfaces;

public class ThreeDMain {
	public static void main(String[] args) {
		ThreeDimensionalShape

		cube = () -> {
			System.out.println("Volume cube computed");
		};

		cube.computeVolume();
		ThreeDimensionalShape.applyColor("blue");
		cube.enlarge();
		ThreeDimensionalShape.rotate("left");
		cube.erase();

		ThreeDimensionalShape cuboid = () -> {
			System.out.println("Volume cuboid computed");
		};
		cuboid.computeVolume();
		ThreeDimensionalShape.applyColor("red");
		ThreeDimensionalShape.rotate("Right");
		cuboid.enlarge();
		cuboid.erase();
	}

}
