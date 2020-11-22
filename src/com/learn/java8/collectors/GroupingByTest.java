package com.learn.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByTest {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "apple", "mango", "guava", "apple", "mango");

		Map<String, Long> fruitCount = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(fruitCount);

	}
}
