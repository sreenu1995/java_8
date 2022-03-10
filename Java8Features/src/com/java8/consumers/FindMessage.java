package com.java8.consumers;

import java.util.function.Consumer;

public class FindMessage {
	public static void messageFinder(String message) {
		System.out.println("The message says" + message);
	}

	public static void main(String[] args) {
		Consumer<String> consumer = FindMessage::messageFinder;

		consumer.accept("check your inbox");

	}

}
