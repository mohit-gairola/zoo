package com.singtel.zoo;

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


	}

}
