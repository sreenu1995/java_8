package com.java8.Functions;

import java.util.function.Function;

public class SendMessage {
	public static String showMessage(String message) {
		return "Hi," + message;
	}

	public static void main(String[] args) {
		Function<String, String> function = SendMessage::showMessage;
		System.out.println(function.apply("you have a message"));
	}
}
