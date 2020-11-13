package com.learn.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * An immutable class is good for caching purposes because you don’t have to worry about the
 * value changes.

  Another benefit of immutable class is that it is inherently thread-safe, so you don’t 
  have to worry about thread safety in case of multi-threaded environment
 */

/*
 * Make your class final, so that no other classes can extend it.
 */
public final class ImmutableClass {

	/*
	 * Make all your fields final, so that they’re initialized only once inside the
	 * constructor and never modified afterward.
	 */
	private final String name;

	private final int id;

	private final List<String> pets;

	private final HashMap<String, String> testMap;

	public ImmutableClass(String name, int id, List<String> pets, HashMap<String, String> inMap) {
		this.name = name;
		this.id = id;

		List<String> tempPets = new ArrayList<>(pets);
		this.pets = tempPets;

		HashMap<String, String> tempMap = new HashMap<>();
		inMap.entrySet().forEach(item -> {
			tempMap.put(item.getKey(), item.getValue());
		});
		this.testMap = tempMap;
	}

	/*
	 * Don’t expose setter methods.
	 */
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	/*
	 * When exposing methods which modify the state of the class, you must always
	 * return a new instance of the class.
	 */
	public List<String> getPets() {
//		List<String> newPets = new ArrayList<>(pets);
//		return newPets;

		return Collections.unmodifiableList(pets);
	}

	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) this.testMap.clone();
	}

}
