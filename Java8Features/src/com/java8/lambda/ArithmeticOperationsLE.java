package com.java8.lambda;

public class ArithmeticOperationsLE {
	public static void main(String[] args) {
		ArithmeticOperations addition = (a, b) -> (a + b);
		System.out.println(addition.operations(10, 20));

		ArithmeticOperations substration = (a, b) -> (a - b);
		System.out.println(substration.operations(700, 200));
	}
}
