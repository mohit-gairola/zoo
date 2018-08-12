package com.singtel.zoo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZooManager {

	enum AnimalType {
		FLYER, WALKER, SWIMMER, SINGER;
	}

	public Map<AnimalType, Integer> getAnimalCountByType(Animal[] animals) {

		Map<AnimalType, Integer> countMap = new HashMap<>();

		List<Animal> swimmers = Arrays.stream(animals).filter(a -> a instanceof Swimmer).collect(Collectors.toList());
		List<Animal> singers = Arrays.stream(animals).filter(a -> a instanceof Singer).collect(Collectors.toList());
		List<Animal> walkers = Arrays.stream(animals).filter(a -> a instanceof Walker).collect(Collectors.toList());
		List<Animal> flyers = Arrays.stream(animals).filter(a -> a instanceof Flyer).collect(Collectors.toList());

		countMap.put(AnimalType.SWIMMER, swimmers.size());
		countMap.put(AnimalType.WALKER, walkers.size());
		countMap.put(AnimalType.FLYER, flyers.size());
		countMap.put(AnimalType.SINGER, singers.size());

		return countMap;
	}
}
