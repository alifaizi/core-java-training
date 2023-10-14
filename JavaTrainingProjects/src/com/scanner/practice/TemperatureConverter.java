package com.scanner.practice;

import java.util.Scanner;

public class TemperatureConverter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice;

		do {
			System.out.println("Choose an option:");
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			
			choice = input.nextInt();

			switch (choice) {
			case 1:
				convertFahrenheitToCelsius();
				break;
			case 2:
				convertCelsiusToFahrenheit();
				break;
			case 3:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Please choose again.");
			}
		} while (choice != 3);

		input.close();
	}

	public static void convertFahrenheitToCelsius() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Fahrenheit: ");
		
		double fahrenheit = input.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("Temperature in Celsius: " + celsius);
	}

	public static void convertCelsiusToFahrenheit() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celsius: ");
		
		double celsius = input.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	}
}