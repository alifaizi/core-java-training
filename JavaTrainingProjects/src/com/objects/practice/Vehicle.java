package com.objects.practice;

public class Vehicle {
	
	
	/*
	 * Write a program to show the object of Vehicle, 
	 * Create make, model, year, transmission, color as fields.
	 * Create 3 methods as drivingSpeed, fuelType, gasConsumption
	 * Assign values to the fields using setters and print the fields values using getter method.
	 * Create main class and named it VehicleDetails.
	 * In the main method, create 3 objects of Product class and call the setter methods and getter methods to print in the console.
	*/
	
	
	private String make;
	private String model;
	private int year;
	private String trnasmission;
	private String color;
	
	//----------------------------------------------------------
	
	String drivingSpeed(int spped) {
		
		return "Driving speed: " + spped + " mph";
	}
	
	String gasType(String gasType) {
		
		return "Gas Type: " + gasType;
	}
	
	String fuelConsumption(double fuelConsumption) {
		
		return "Fuel Consumption " + fuelConsumption + " mpg";
	}
	
	//-------------------------------------------------------------------

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrnasmission() {
		return trnasmission;
	}

	public void setTrnasmission(String trnasmission) {
		this.trnasmission = trnasmission;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	

}
