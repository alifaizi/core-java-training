package com.Interface.practice;

import java.util.LinkedList;

public class AnimalDetails {

	public static void main(String[] args) {

		Birds bird1 = new Birds("Eagle", "Black", 15);
		Birds bird2 = new Birds("Sparrow", "Brown", 3);
		Birds bird3 = new Birds("Parrot", "Green", 5);
		Birds bird4 = new Birds("Pigeon", "White", 10);

		LinkedList<Birds> birdList = new LinkedList<Birds>();

		birdList.add(bird1);
		birdList.add(bird2);
		birdList.add(bird3);
		birdList.add(bird4);

		for (Birds bird : birdList) {

			System.out.println(bird.name + " " + bird.Color + " " + bird.age);

		}
		
		System.out.println("------------------------------------------------------------------------------------------------");

		Mammalia mammal1 = new Mammalia("Dogs", "White", 8);
		Mammalia mammal2 = new Mammalia("Horse", "Grey", 12);
		Mammalia mammal3 = new Mammalia("Cow", "Black", 4);
		Mammalia mammal4 = new Mammalia("Cat", "Black and White", 7);

		LinkedList<Mammalia> mammaliaList = new LinkedList<Mammalia>();

		mammaliaList.add(mammal1);
		mammaliaList.add(mammal2);
		mammaliaList.add(mammal3);
		mammaliaList.add(mammal4);

		for (Mammalia mammal : mammaliaList) {
			
			System.out.println(mammal.name + " " + mammal.color + " " + mammal.age);

		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		Reptiles rep1 = new Reptiles("Crocodile", "Brown", 4);
		Reptiles rep2 = new Reptiles("Frog", "Green", 9);
		Reptiles rep3 = new Reptiles("Worm", "Black", 3);
		Reptiles rep4 = new Reptiles("Turtle", "Grey", 6);

		LinkedList<Reptiles> repList = new LinkedList<Reptiles>();

		repList.add(rep1);
		repList.add(rep2);
		repList.add(rep3);
		repList.add(rep4);

		for (Reptiles rep : repList) {
			
			System.out.println(rep.name + " " + rep.color + " " + rep.age);
			
		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		Insects ins1 = new Insects("Bee", "Brown", 4);
		Insects ins2 = new Insects("Fly", "Black", 1);
		Insects ins3 = new Insects("Butterfly", "Rainbow", 2);
		Insects ins4 = new Insects("Spider", "Grey", 4);

		LinkedList<Insects> insectList = new LinkedList<Insects>();

		insectList.add(ins1);
		insectList.add(ins2);
		insectList.add(ins3);
		insectList.add(ins4);

		for (Insects insect : insectList) {
			
			System.out.println(insect.name + " " + insect.color + " " + insect.age);
			
		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		MarineAnimals ma1 = new MarineAnimals("Fish", "Silver", 7);
		MarineAnimals ma2 = new MarineAnimals("Whale", "Black", 6);
		MarineAnimals ma3 = new MarineAnimals("Sea Horse", "Red", 5);
		MarineAnimals ma4 = new MarineAnimals("Dolphine", "Black and White", 6);

		LinkedList<MarineAnimals> maList = new LinkedList<MarineAnimals>();

		maList.add(ma1);
		maList.add(ma2);
		maList.add(ma3);
		maList.add(ma4);

		for (MarineAnimals mal : maList) {
			
			System.out.println(mal.name + " " + mal.color + " " + mal.age);

		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		LinkedList<ZooAnimals> zoo = new LinkedList<ZooAnimals>();
		
		zoo.addAll(birdList);
		zoo.addAll(mammaliaList);
		zoo.addAll(repList);
		zoo.addAll(insectList);
		zoo.addAll(maList);
		
		for (ZooAnimals animal : zoo) {
			
			System.out.println(animal);
			
		}

	}

}
