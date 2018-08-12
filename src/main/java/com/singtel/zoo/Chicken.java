package com.singtel.zoo;

public class Chicken extends Bird implements Swimmer {

	@Override
	public void swim() {
		System.out.println("I am swimming");

	}

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}

}
