package com.singtel.zoo.animals;

import org.springframework.beans.factory.annotation.Autowired;

import com.singtel.zoo.config.Message;

public class Rooster extends Animal implements Singer {
	
	private Chicken chicken = new Chicken();

	@Autowired
	private Message message;
	

	@Override
	public void sing() {
		System.out.println(message.get("zoo.rooster.sound"));
	}

	void swim() {
		chicken.swim();
	}

}
