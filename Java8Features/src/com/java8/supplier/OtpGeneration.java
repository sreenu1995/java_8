package com.java8.supplier;

import java.util.function.Supplier;

public class OtpGeneration {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			String otp = "otp is: ";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}

}
