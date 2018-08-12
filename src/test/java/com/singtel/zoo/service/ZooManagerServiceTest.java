package com.singtel.zoo.service;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

public class ZooManagerServiceTest {

	ZooManagerService zooManager;

	@Before
	public void setUp() {
		zooManager = new ZooManagerService();
	}

	@Test
	public void testAnimalCountByType() {
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot<Dog>(new Dog()),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly("Rosy"),
				new Cat() };
		Map<AnimalType, Integer> countMap = zooManager.getAnimalCountByType(animals);
		Assert.assertEquals(2, countMap.get(AnimalType.FLYER).intValue());
		Assert.assertEquals(4, countMap.get(AnimalType.WALKER).intValue());
		Assert.assertEquals(7, countMap.get(AnimalType.SINGER).intValue());
		Assert.assertEquals(7, countMap.get(AnimalType.SWIMMER).intValue());

	}

}
