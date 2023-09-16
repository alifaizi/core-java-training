package com.control.statement.practice;

public class IfElseConditionsExample {

	public static void main(String[] args) {
		
		
		int carPrice = 40000;
		String carName = "Ford";
		
		if (carPrice >= 10000 && carPrice <= 50000 && carName == "Ford") {
			System.out.println("I can afford to buy this car!");
				
			}else if (carPrice <= 9999 && carName == "Ford") {
				
				System.out.println("This car is salvage!");
				
			}else if (carPrice >= 50000 && carName =="Ford") {
				
				System.out.println("This car is too expensive!");
				
			} else if(carPrice >= 10000 && carPrice <= 50000 && carName == "Honda") {
				
				System.out.println("I can afford to buy this car but I don't like Honda!");
				
			} else{
				
				System.out.println("I'll wait for my car to come in the market!");
				
		}
	}
}
			