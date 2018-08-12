package com.singtel.zoo;

public abstract class Bird extends Animal implements Walker, Singer {

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void sing() {
		System.out.println("I am singing");
	}

}
