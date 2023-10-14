package com.abstraction.with_obstract_class;

public class Horse extends Animal {

	@Override
	String move() {

		return "Horse moves by running";
	}

	@Override
	String eat() {

		return "Horse eat grass";
	}

}
