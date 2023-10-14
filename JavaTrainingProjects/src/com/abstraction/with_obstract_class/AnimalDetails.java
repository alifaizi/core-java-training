package com.abstraction.with_obstract_class;

public class AnimalDetails {

	public static void main(String[] args) {

//		Animal  horse = new Horse(); // Access to Animal (abstraction class)
		
		System.out.println("--------------------Horse------------------------");

		Horse horse1 = new Horse(); // Only access Horse class (class)
		System.out.println(horse1.move());
		System.out.println(horse1.eat());
		horse1.details();

		System.out.println("\n--------------------Bird-------------------------");

		Bird Pegion = new Bird();
		System.out.println(Pegion.move());
		System.out.println(Pegion.eat());

		Pegion.details();

		System.out.println("\n--------------------Lion--------------------------");

		Lion lionKing = new Lion();
		System.out.println(lionKing.move());
		System.out.println(lionKing.eat());

		lionKing.details();

	}

}
