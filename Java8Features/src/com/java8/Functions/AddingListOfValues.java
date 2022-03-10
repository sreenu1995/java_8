package com.java8.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AddingListOfValues {
	public static int addList(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		Function<List<Integer>, Integer> function = AddingListOfValues::addList;
		int result = function.apply(list);
		System.out.println("The result of sum is=" + result);

	}

}
