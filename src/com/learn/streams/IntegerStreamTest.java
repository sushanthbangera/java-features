package com.learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamTest {

	
	public static void main(String[] args) {
		
		// Converting a simple list to stream
		List<Integer> intList = Arrays.asList(1, 2, 4, 6, 7);
		Stream<Integer> intStream = intList.stream();
		intStream.forEach(System.out::println);
		
		// Creating a stream of random number
		
		System.out.println("-- Printing 10 Randoms using Stream --");
		Supplier<Integer> randomInts = () -> new Random().nextInt(100);
		Stream<Integer> randomNum = Stream.generate(randomInts);
		
		randomNum.limit(10).forEach(System.out::println);
		
		System.out.println("-- Printing 5 Randoms using Stream --");
		IntStream inStream = new Random().ints();
		inStream.limit(5).forEach(System.out::println);
		
		System.out.println("-- Filtering Even Numbers --");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
		List<Integer> evenList = list.stream()
				.filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		evenList.forEach(item -> System.out.print(item + ", "));
	}
}
