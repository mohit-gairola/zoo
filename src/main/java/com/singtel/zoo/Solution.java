package com.singtel.zoo;

import java.util.Map;

import com.singtel.zoo.animals.Animal;
import com.singtel.zoo.animals.Butterfly;
import com.singtel.zoo.animals.Cat;
import com.singtel.zoo.animals.Chicken;
import com.singtel.zoo.animals.Clownfish;
import com.singtel.zoo.animals.Dog;
import com.singtel.zoo.animals.Dolphin;
import com.singtel.zoo.animals.Duck;
import com.singtel.zoo.animals.Fish;
import com.singtel.zoo.animals.Frog;
import com.singtel.zoo.animals.Parrot;
import com.singtel.zoo.animals.Rooster;
import com.singtel.zoo.animals.Shark;
import com.singtel.zoo.service.ZooManagerService;
import com.singtel.zoo.service.ZooManagerService.AnimalType;

public class Solution {

	public static void main(String[] args) {

		Duck duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();

		// To check sound of parrots living with Dogs,Cats and Roosters
		Parrot<Dog> parrotLivingWithDogs = new Parrot<Dog>(new Dog());
		Parrot<Cat> parrotLivingWithCats = new Parrot<Cat>(new Cat());
		Parrot<Rooster> parrotLivingWithRooster = new Parrot<Rooster>(new Rooster());
		parrotLivingWithDogs.sing();
		parrotLivingWithCats.sing();
		parrotLivingWithRooster.sing();

		//To count how many animals can swim,sing,walk and fly
		ZooManagerService zooManager = new ZooManagerService();
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
