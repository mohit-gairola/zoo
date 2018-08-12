package com.singtel.zoo;

public class Cat extends Animal implements Singer {
	@Override
	public void sing() {
		System.out.println("Meow");

	}
}
