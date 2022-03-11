package com.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(20);
		l.add(0);
		l.add(30);
		l.add(40);
		l.add(25);
		l.add(15);
		l.add(35);
		System.out.println(l);
		// to find even numbers
		List<Integer> evenNumbers = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		// to find greater values in the list
		List<Integer> greaterNumbers = l.stream().filter(i -> i > 15).collect(Collectors.toList());
		System.out.println(greaterNumbers);

		// count the values in the list
		long count = l.stream().filter(i -> i > 15).count();
		System.out.println("The count of >15 is " + count);

		// to convert double values in list of elements present in arraylist
		List<Integer> doubleAll = l.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(doubleAll);

		// to increment the values by 3 in list of elements present in arraylist
		List<Integer> increaseAll = l.stream().map(i -> i + 3).collect(Collectors.toList());
		System.out.println(increaseAll);

		// sort the values ascending order
		List<Integer> ascOrder = l.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("The Ascending order is " + ascOrder);

		// sort the values descending order
		List<Integer> desOrder = l.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("The Descending order is " + desOrder);

		// find min value in the list of ascending order
		int minA = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum values of ascending order is " + minA);

		// find max value in the list of ascending order
		int maxA = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum values is ascending order is " + maxA);

		// find min value in the list of descending order
		int minD = l.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Minimum values of descending order is " + minD);

		// find max value in the list of descending order
		int maxD = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum values of descending order is " + maxD);

		// To print the values in line by line by using toArray()
		Integer[] i = l.stream().toArray(Integer[]::new);
		for (Integer i2 : i) {
			System.out.println("......toArray() will gives...... ");
			System.out.println(i2);
		}

	}
}
