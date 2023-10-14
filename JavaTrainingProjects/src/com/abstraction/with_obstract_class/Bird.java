package com.abstraction.with_obstract_class;

public class Bird extends Animal {

	@Override
	String move() {

		return "Bird moves by flying";
	}

	@Override
	String eat() {

		return "bird eats mammal";
	}

}
