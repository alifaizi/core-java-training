package com.Interface.practice;

public class Mammalia implements ZooAnimals {
	
	String name;
	String color;
	int age;
	
	public Mammalia(String name, String color, int age) {

		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Mammalia [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	

}
