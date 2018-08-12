package com.singtel.zoo;

public class Dog extends Animal implements Singer{

	@Override
	public void sing() {
		System.out.println("Woof, woof");

	}

}
