package com.singtel.zoo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.zoo.animals.Animal;
import com.singtel.zoo.animals.Butterfly;
import com.singtel.zoo.animals.Cat;
import com.singtel.zoo.animals.Chicken;
import com.singtel.zoo.animals.Clownfish;
import com.singtel.zoo.animals.Dog;
import com.singtel.zoo.animals.Dolphin;
import com.singtel.zoo.animals.Duck;
import com.singtel.zoo.animals.Fish;
import com.singtel.zoo.animals.Frog;
import com.singtel.zoo.animals.Parrot;
import com.singtel.zoo.animals.Rooster;
import com.singtel.zoo.animals.Shark;
import com.singtel.zoo.service.ZooManagerService;
import com.singtel.zoo.service.ZooManagerService.AnimalType;

@RestController
public class AnimalController {

	@Autowired
	ZooManagerService zooManagerService;

	@Autowired
	ZooManagerService zooManager;

	@RequestMapping("/animals/count")
	public Map<AnimalType, Integer> getAnimalCount() {

		//Sample data set used for animals. (DB should be used in real world)
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot<Dog>(new Dog()),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly("Rosy"),
				new Cat() };

		return zooManagerService.getAnimalCountByType(animals);

	}
}
