package com.accenture.lkm.lambdademo;

public class LambdaMain {

	public static void main(String[] args) {
		// lambda without parameter and only one statement
		Greetings english = () -> System.out.println("Welcome onboard");
		english.greet();

		Greetings spanish = () -> System.out.println("Bienvenido a bordo");
		spanish.greet();

		// lambda with parameter
		Shape square = (direction) -> {
			System.out.println("Rotated " + direction);
		};

		square.rotate("Left");
		square.rotate("Right");

		Calculator total = (first, second) -> {
			return (first + second);
		};
		int result = total.operation(10, 20);
		System.out.println("Sum is " + result);

		Calculator difference = (first, second) -> {
			if (first > second) {
				return (first - second);
			} else {
				return (second - first);
			}
		};
		result = difference.operation(40, 50);
		System.out.println("Difference is " + result);
	}

}
