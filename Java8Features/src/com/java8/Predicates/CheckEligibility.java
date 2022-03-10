package com.java8.Predicates;

import java.util.function.Predicate;

public class CheckEligibility {
	public static void main(String[] args) {
		Predicate<Integer> predicate = person -> person > 21;
		System.out.println(
				"That person is crossed his Minority when becomes 21 years (or) The person is under Minority");
		System.out.println(predicate.test(20));
	}
}
