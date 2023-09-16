package com.constructor.practice;

public class Vehicle {
	
	
	public String make;
	public String model;
	public int year;
	public String color;
	
	
	public Vehicle(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		
	}
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("Toyota", "Highlander", 2023, "White");
		
		System.out.println("Make: " + vehicle.make);
		System.out.println("MOdel: " + vehicle.model);
		System.out.println("Year: " + vehicle.year);
		System.out.println("Color: " + vehicle.color);
			
		}

}
