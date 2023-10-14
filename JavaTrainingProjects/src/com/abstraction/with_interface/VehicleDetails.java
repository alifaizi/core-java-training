package com.abstraction.with_interface;

public class VehicleDetails {
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------BMW------------------------------");
		
		BMW bmw = new BMW();
		System.out.println(bmw.run());
		System.out.println(bmw.gasConsumption());
		
		System.out.println("-----------------------Highlanfer-----------------------");
		
		Highlander hl = new Highlander();
		System.out.println(hl.run());
		System.out.println(hl.gasConsumption());
		
		System.out.println("-----------------------Ford-----------------------------");
		
		Ford ford = new Ford();
		System.out.println(ford.run());
		System.out.println(ford.gasConsumption());
		
	}

}
