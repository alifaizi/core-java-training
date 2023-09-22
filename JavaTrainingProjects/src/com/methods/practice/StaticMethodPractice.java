package com.methods.practice;

public class StaticMethodPractice {

	public static String sumTwoNumbers(String firdtName, String lastName) {

		return firdtName + lastName;
	}

	public static String printSentence() {
		return "Java is easy, if we practice!";
	}

	public static int sumTwoNumber() {

		int a = 20;
		int b = 30;

		return a + b;

	}

	public static void main(String[] args) {

		String fullName = sumTwoNumbers("Ali ", "Faizi");

		System.out.println(fullName);

		System.out.println("-------------------------------------------------");

		String printTheSentence = printSentence();
		System.out.println(printTheSentence);

		System.out.println("-------------------------------------------------");

		System.out.println(sumTwoNumber());

	}

}
