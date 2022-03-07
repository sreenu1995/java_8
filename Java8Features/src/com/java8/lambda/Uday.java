package com.java8.lambda;

public class Uday {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("daimonds");
			}
		};
		r.run();
	}
}
