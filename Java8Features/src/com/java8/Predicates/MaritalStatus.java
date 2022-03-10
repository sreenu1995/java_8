package com.java8.Predicates;

import java.util.function.Predicate;

public class MaritalStatus {
	public static boolean checkStatus(int age) {
		if (age >= 18) {
			System.out.println("Eligible for girls");
			return true;
		} else if (age >= 21) {
			System.out.println("Eligible for boys");
			return true;
		} else {
			System.out.println("not Eligible !");
			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = MaritalStatus::checkStatus;
		predicate.test(18);
	}
}
