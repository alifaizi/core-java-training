package com.arrays.practice;

public class ArrayOfNames {

	public static void main(String[] args) {

		// Create an Array of names with 5 elements and loop through to print in the
		// console.

		// Create an array of names with 5 elements

		String[] names = { "Ali", "Ahmad", "Mahmodd", "Matin", "Dawood" };

		// Loop through the array and print each name

		for (String name : names) {

			System.out.println(name);

		}
		
		System.out.println("--------------------------------------------------");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

			
		}
	}
}