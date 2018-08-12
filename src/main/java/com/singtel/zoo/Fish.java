package com.singtel.zoo;

public class Fish extends Animal implements Swimmer {

	enum Size {
		SMALL, LARGE;
	}

	enum Color {
		GREY, ORANGE;
	}

	boolean predator;

	boolean joker;

	Size size;

	Color color;

	@Override
	public void swim() {
		System.out.println("Fish is swimming");

	}

}
