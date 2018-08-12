package com.singtel.zoo;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.ZooManager.AnimalType;

public class ZooManagerTest {

	ZooManager zooManager;

	@Before
	public void setUp() {
		zooManager = new ZooManager();
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
