package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 });

		List<Integer> evenNumbers = numbers.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());

		evenNumbers.forEach(System.out::println);

		List<String> fruitsAndVegs = Arrays.asList("appple", "mango", "carrot", "jackfruit");

		System.out.println(fruitsAndVegs);

		List<String> fruits = fruitsAndVegs.stream().filter(f -> !f.equals("carrot")).collect(Collectors.toList());

		System.out.println(fruits);
	}
}
