package com.singtel.zoo.animals;

public class Butterfly extends Animal implements Flyer {

	private String name;

	private Caterpillar caterpillar;

	public Butterfly(Caterpillar caterpillar) {
		this.caterpillar = caterpillar;
	}

	public Butterfly(String name) {
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
