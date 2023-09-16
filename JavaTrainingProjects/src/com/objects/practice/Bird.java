package com.objects.practice;

public class Bird {
	
	public String name;
	public String color;
	
	public String flyUp() {
		
		return "This bird flys up to 1,000 feet high";
	}
	
	public Bird(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public static void main(String[] args) {
		
		Bird bird = new Bird("Eagle", "Black");
		
		System.out.println("Bird Name: " + bird.name);
		System.out.println("Bird Color: " + bird.color);
		System.out.println(bird.flyUp());
	}

}
