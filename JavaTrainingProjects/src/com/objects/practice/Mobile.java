package com.objects.practice;

public class Mobile {

	String name;
	double price;
	
	public Mobile(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile("iPhone 14", 1200);
		
		System.out.println(myMobile.name);
		System.out.println(myMobile.price);
		
	}
}
