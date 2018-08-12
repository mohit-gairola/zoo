package com.singtel.zoo;

public class Duck extends Bird implements Swimmer, Flyer {

	@Override
	public void swim() {
		System.out.println("I am swimming");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");

	}

	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

}
