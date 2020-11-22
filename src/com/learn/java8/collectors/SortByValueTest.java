package com.learn.java8.collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByValueTest {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("grape", "apple", "guava", "sapota", "mango", "guava", "apple", "guava", "grape");

		Map<String, Long> fruitCountMap = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(fruitCountMap);

		Map<String, Long> sortedMap = new LinkedHashMap<>();

		// Sorting based on the values
		fruitCountMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));

		System.out.println(sortedMap);
	}
}
