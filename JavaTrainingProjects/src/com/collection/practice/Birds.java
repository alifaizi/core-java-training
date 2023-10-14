package com.collection.practice;

public class Birds implements ZooAnimals{
	
	String name;
	String Color;
	int age;
	
	public Birds(String name, String color, int age) {

		this.name = name;
		Color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		
		return "Birds [name=" + name + ", Color=" + Color + ", age=" + age + "]";
	}
	
	
	
	
}
