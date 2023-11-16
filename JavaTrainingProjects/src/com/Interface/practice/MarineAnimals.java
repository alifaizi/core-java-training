package com.Interface.practice;

public class MarineAnimals implements ZooAnimals {
	
	String name;
	String color;
	int age;
	
	public MarineAnimals(String name, String color, int age) {

		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MarineAnimals [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	

}
