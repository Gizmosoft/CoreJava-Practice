package com.accenture.lkm.client;

import com.accenture.lkm.whiteboard.Cube;
import com.accenture.lkm.whiteboard.Cubiod;
import com.accenture.lkm.whiteboard.ThreeDShape;

public class MethodDispatch {

	public static void main(String[] args) {
		ThreeDShape shape;
		shape = new Cubiod("pink", 2, 2, 3);
		shape.applyColor();
		double volume = shape.computeVolume();
		System.out.println("Volume of cuboid is " + volume);
		shape.zoomInOrOut(true);

		shape = new Cube("brown", 4);
		shape.applyColor();
		volume = shape.computeVolume();
		System.out.println("Volume of cube is " + volume);
		shape.zoomInOrOut(true);

	}

}
