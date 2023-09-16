package com.methods.practice;

public class Fruit {
	
	private String name;
	private double price;
	
	//-------------------------------------------------------------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//--------------------------------------------------------------------------------
	
	private boolean isTesty() {
		
		return false;
	}
	
	private boolean isNotExpensive() {
		
		return true;
	}
	
	//---------------------------------------------------------------------------------
	
	public void displayFruitDetails() {
		System.out.println("Fruit Name: " + getName());
		System.out.println("Fruit Price: " + getPrice());
		System.out.println("It is tasty: " + isTesty());
		System.out.println("It is expensive: " + isNotExpensive());
	}

}
