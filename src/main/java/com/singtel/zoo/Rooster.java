package com.singtel.zoo;

public class Rooster extends Animal implements Singer {
	
	private Chicken chicken = new Chicken();

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}

	void swim() {
		chicken.swim();
	}

}
