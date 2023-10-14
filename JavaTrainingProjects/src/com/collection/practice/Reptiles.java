package com.collection.practice;

public class Reptiles implements ZooAnimals {
	
	String name;
	String color;
	int age;
	
	public Reptiles(String name, String color, int age) {
		super();		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Reptiles [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	
	
}
