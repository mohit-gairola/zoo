package com.singtel.zoo.animals;

public class Parrot<T> extends Bird {

	T obj;

	public Parrot(T obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void sing() {
		Singer singer = (Singer) obj;
		singer.sing();
	}
}
