package com.objects.practice;

public class VehicleDetails {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle3 = new Vehicle();
		
		vehicle1.setMake("Toyota");
		vehicle1.setModel("Camry");
		vehicle1.setYear(2021);
		vehicle1.setTrnasmission("Automatic");
		vehicle1.setColor("White");
		
		vehicle2.setMake("Honda");
		vehicle2.setModel("Civic");
		vehicle2.setYear(2022);
		vehicle2.setTrnasmission("Manual");
		vehicle2.setColor("Black");
		
		vehicle3.setMake("Ford");
		vehicle3.setModel("F-150");
		vehicle3.setYear(2023);
		vehicle3.setTrnasmission("Automaic");
		vehicle3.setColor("Silver");
		
		System.out.println("Object 1 Details: ");
		System.out.println("Make: " + vehicle1.getMake());
		System.out.println("Model: " + vehicle1.getModel());
		System.out.println("Year: " + vehicle1.getYear());
		System.out.println("Transmission: " + vehicle1.getTrnasmission());
		System.out.println("Color: " + vehicle1.getColor());
		
		System.out.println(vehicle1.drivingSpeed(120));
		System.out.println(vehicle1.gasType("Gasoline"));
		System.out.println(vehicle1.fuelConsumption(25.5));
		
		
		System.out.println();
		
		System.out.println("Object 2 Details: ");
		System.out.println("Make: " + vehicle2.getMake());
		System.out.println("Model: " + vehicle2.getModel());
		System.out.println("Year: " + vehicle2.getYear());
		System.out.println("Transmission: " + vehicle2.getTrnasmission());
		System.out.println("Color: " + vehicle2.getColor());
		
		System.out.println(vehicle2.drivingSpeed(90));
		System.out.println(vehicle2.gasType("CNG"));
		System.out.println(vehicle2.fuelConsumption(27.9));
		
		System.out.println();
		
		System.out.println("Object 3 Details: ");
		System.out.println("Make: " + vehicle3.getMake());
		System.out.println("Model: " + vehicle3.getModel());
		System.out.println("Year: " + vehicle3.getYear());
		System.out.println("Transmission: " + vehicle3.getTrnasmission());
		System.out.println("Color: " + vehicle3.getColor());
		
		System.out.println(vehicle2.drivingSpeed(70));
		System.out.println(vehicle2.gasType("Petrol"));
		System.out.println(vehicle2.fuelConsumption(30.2));
		
	}

}
