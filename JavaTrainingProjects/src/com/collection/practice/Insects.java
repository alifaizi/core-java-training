package com.collection.practice;

public class Insects implements ZooAnimals {
	
	String name;
	String color;
	int age;
	
	public Insects(String name, String color, int age) {

		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Insects [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	
	
}
