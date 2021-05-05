package com.accenture.lkm.innerclass;

public class ShapeMain {

	public static void main(String[] args) {
		TwoDimensionalShape circle = new TwoDimensionalShape() {
			double radius = 3.5;
			double pi = 3.14;
			double area;

			@Override
			public void computeArea() {
				area = radius * radius * pi;
				System.out.println("Area of circle is " + area);
			}
		};
		circle.computeArea();
		System.out.println(circle.getClass());
		TwoDimensionalShape rectangle = new TwoDimensionalShape() {
			double length = 4;
			double breadth = 3;
			double area;

			@Override
			public void computeArea() {
				// TODO Auto-generated method stub
				area = length * breadth;
				System.out.println("Area of rectangle is " + area);
			}

		};
		rectangle.computeArea();
		System.out.println(rectangle.getClass());
	}

}
