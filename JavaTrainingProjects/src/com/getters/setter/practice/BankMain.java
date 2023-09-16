package com.getters.setter.practice;

public class BankMain {

	public static void main(String[] args) {
		
		Bank obj1 = new Bank();
		
		obj1.setAccountHolder("Ali");
		obj1.setAccountName("Checking");
		obj1.setRoutingNumber(121212121);
		obj1.setAccountNumber(123456789);
		
		System.out.println("Account Holder Name: " + obj1.getAccountHolder());
		System.out.println("Account Name: " + obj1.getAccountName());
		System.out.println("Account Rounting Number: " + obj1.getRoutingNumber());
		System.out.println("Account Number: " + obj1.getAccountNumber());
		
		System.out.println("\n"); // Enter = Blank Line
		
		Bank obj2 = new Bank();
		
		obj2.setAccountHolder("Faizi");
		obj2.setAccountName("Credit");
		obj2.setRoutingNumber(989898989);
		obj2.setAccountNumber(987654321);
		
		System.out.println("Account Holder Name: " + obj2.getAccountHolder());
		System.out.println("Account Name: " + obj2.getAccountName());
		System.out.println("Account Routing Number: " + obj2.getRoutingNumber());
		System.out.println("Account Number: " + obj2.getAccountNumber());
	}
}
