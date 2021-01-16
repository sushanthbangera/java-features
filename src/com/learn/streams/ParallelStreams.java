package com.learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}

		Stream<Integer> intStream = list.stream();

		Integer[] evenArray = intStream.parallel().filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(evenArray));

	}
}
