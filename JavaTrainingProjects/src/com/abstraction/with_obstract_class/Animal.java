package com.abstraction.with_obstract_class;

public abstract class Animal {
	
	abstract String move();
	abstract String eat();
	
	
	void details() {
		System.out.println("Every animal is a creature.");
	}

}
