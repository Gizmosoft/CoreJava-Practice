package com.accenture.lkm.client;

import com.accenture.lkm.whiteboard.Cube;
import com.accenture.lkm.whiteboard.Cubiod;

public class WhiteboardMain {

	public static void main(String[] args) {
		Cubiod cub = new Cubiod("blue", 5, 4, 3);
		double volume = cub.computeVolume();
		System.out.println("Volume of cuboid is " + volume);
		cub.applyColor();
		cub.zoomInOrOut(true);

		Cube cube = new Cube("black", 5);
		volume = cube.computeVolume();
		System.out.println("Volume of cube is " + volume);
		cube.applyColor();
		cube.zoomInOrOut(false);
	}

}
