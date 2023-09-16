package com.methods.practice;

public class FruitDetail {
	
	public static void main(String[] args) {
		
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		Fruit fruit3 = new Fruit();
		
		//---------------------------------------------------------------------------------
		
		fruit1.setName("Orange");
		fruit1.setPrice(2.4);
		
		fruit2.setName("Apple");
		fruit2.setPrice(1.9);
		
		
		fruit3.setName("Banana");
		fruit3.setPrice(0.99);
		
		//---------------------------------------------------------------------------------
		
		System.out.println("Orange Details: ");
		fruit1.displayFruitDetails();
		
		System.out.println("-------------------------------");
		
		System.out.println("Apple Details: ");
		fruit2.displayFruitDetails();;
		
		System.out.println("-------------------------------");
		
		System.out.println("Banana Details: ");
		fruit3.displayFruitDetails();
		
		
		
	}

}
