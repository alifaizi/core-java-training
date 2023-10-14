package com.abstraction.with_interface;

public class Highlander implements Vehicle {

	@Override
	public String run() {
		
		return "160 mph";
	}

	@Override
	public String gasConsumption() {
		
		return "25 mpg";
	}

}
