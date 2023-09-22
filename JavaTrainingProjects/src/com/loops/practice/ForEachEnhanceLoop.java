package com.loops.practice;

public class ForEachEnhanceLoop {

	public static void main(String[] args) {

		String[] names = { "Ali", "Ahmad", "Sarah", "Matin", "John", "Oscar", "Smith" };

		for (String name : names) {

			System.out.println(name);
		}

		System.out.println("-----------------------------------------------------------");

		String[] stringOfNames = { "Ali", "Ahmad", "Sarah", "Matin", "John", "Oscar", "Smith" };

		System.out.println(stringOfNames[5]);

	}
	

}