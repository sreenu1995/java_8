package com.java8.lambda;

public class UsingLEFI {

	public static void main(String[] args) {
		PrintAbs pabs = () -> {

			System.out.println("Printing Abstract Method using LE and FI");

		};
		pabs.printAbsMethod();

	}

}
