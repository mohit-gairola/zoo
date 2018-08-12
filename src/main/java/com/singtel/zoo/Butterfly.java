package com.singtel.zoo;

public class Butterfly extends Animal implements Flyer {

	private String name;

	private Caterpillar caterpillar;

	Butterfly(Caterpillar caterpillar) {
		this.caterpillar = caterpillar;
	}

	Butterfly(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("Butterfly is flying");
	}

	public String getName() {
		return this.caterpillar != null ? caterpillar.getName() : this.name;
	}
}
