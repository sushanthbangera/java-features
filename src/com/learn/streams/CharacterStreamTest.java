package com.learn.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharacterStreamTest {

	public static void main(String[] args) {
		
		IntStream intStream = "12345_abcdefg".chars();
		intStream.forEach(System.out::println);
		
		Stream<String> strStream = Stream.of("A$B$C".split("\\$"));
		strStream.forEach(System.out::println);
	}
}
