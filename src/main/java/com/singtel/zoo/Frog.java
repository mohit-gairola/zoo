package com.singtel.zoo;

public class Frog extends Animal implements Swimmer,Walker,Singer {

	@Override
	public void sing() {
		System.out.println("Croak, croak");
		
	}

	@Override
	public void walk() {
		System.out.println("Frog is walking");
		
	}

	@Override
	public void swim() {
		System.out.println("Frog is swimming");
		
	}

}
