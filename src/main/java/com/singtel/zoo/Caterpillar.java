package com.singtel.zoo;

public class Caterpillar extends Animal implements Walker {

	private String name;

	Caterpillar(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println("Caterpillar is crawling");
	}

	Butterfly metamorphose() {
		return new Butterfly(this);

	}

	public String getName() {
		return name;
	}

	
}
