package com.accenture.lkm.whiteboard;

public class Cubiod extends ThreeDShape {
	private int length;
	private int breadth;
	private int height;

	/**
	 * @param shapeColor
	 * @param length
	 * @param breadth
	 * @param height
	 */
	public Cubiod(String shapeColor, int length, int breadth, int height) {
		super(shapeColor);
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	public double computeVolume() {
		shapeVolume = length * breadth * height;
		return shapeVolume;
	}

}
