package com.singtel.zoo;

import java.util.Map;

import com.singtel.zoo.ZooManager.AnimalType;

public class Solution {

	public static void main(String[] args) {

		Duck duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();

		
		Parrot<Dog> parrotLivingWithDogs = new Parrot<Dog>(new Dog());
		Parrot<Cat> parrotLivingWithCats = new Parrot<Cat>(new Cat());
		Parrot<Rooster> parrotLivingWithRooster = new Parrot<Rooster>(new Rooster());
		parrotLivingWithDogs.sing();
		parrotLivingWithCats.sing();
		parrotLivingWithRooster.sing();
		

		ZooManager zooManager = new ZooManager();
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot<Dog>(new Dog()),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly("Rosy"),
				new Cat() };
		Map<AnimalType, Integer> countMap = zooManager.getAnimalCountByType(animals);
		System.out.println("Number of Animals who can fly  : " + countMap.get(AnimalType.FLYER));
		System.out.println("Number of Animals who can walk : " + countMap.get(AnimalType.WALKER));
		System.out.println("Number of Animals who can sing : " + countMap.get(AnimalType.SINGER));
		System.out.println("Number of Animals who can swim : " + countMap.get(AnimalType.SWIMMER));

	}

}
