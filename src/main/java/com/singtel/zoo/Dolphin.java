package com.singtel.zoo;

public class Dolphin extends Animal implements Swimmer {

	@Override
	public void swim() {
		System.out.println("Dolphin is swimming");
	}

}
