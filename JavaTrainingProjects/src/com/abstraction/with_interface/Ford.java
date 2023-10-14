package com.abstraction.with_interface;

public class Ford implements Vehicle {

	@Override
	public String run() {
	
		return "140 mph";
	}

	@Override
	public String gasConsumption() {
		
		return "20 mpg";
	}

}
