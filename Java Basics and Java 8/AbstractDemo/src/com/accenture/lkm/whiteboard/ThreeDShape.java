package com.accenture.lkm.whiteboard;

public abstract class ThreeDShape {

	protected double shapeVolume;
	private String shapeColor;

	public ThreeDShape(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	public abstract double computeVolume();

	public void applyColor() {
		System.out.println("Applied color " + shapeColor);
	}

	public void zoomInOrOut(boolean zoomIn) {
		if (zoomIn) {
			System.out.println("Zoomed in");
		} else {
			System.out.println("Zoomed out");
		}
	}

}
