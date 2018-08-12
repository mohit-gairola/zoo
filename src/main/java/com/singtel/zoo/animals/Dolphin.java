package com.singtel.zoo.animals;

public class Dolphin extends Animal implements Swimmer {

	@Override
	public void swim() {
		System.out.println("Dolphin is swimming");
	}

}
