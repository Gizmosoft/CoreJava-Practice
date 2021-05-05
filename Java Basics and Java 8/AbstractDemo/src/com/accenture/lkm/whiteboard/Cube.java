package com.accenture.lkm.whiteboard;

public class Cube extends ThreeDShape {

	private int side;

	/**
	 * @param shapeColor
	 * @param side
	 */
	public Cube(String shapeColor, int side) {
		super(shapeColor);
		this.side = side;
	}

	@Override
	public double computeVolume() {
		shapeVolume = side * side * side;
		return shapeVolume;
	}

}
