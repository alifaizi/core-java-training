package com.abstraction.with_interface;

public class BMW implements Vehicle {

	@Override
	public String run() {
		
		return "180 mph";
	}

	@Override
	public String gasConsumption() {
		
		return "Consumes 30 mpg";
	}

}
