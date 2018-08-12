package com.singtel.zoo.animals;

public class Dog extends Animal implements Singer{

	@Override
	public void sing() {
		System.out.println("Woof, woof");

	}

}
