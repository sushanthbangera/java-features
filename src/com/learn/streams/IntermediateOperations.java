package com.learn.streams;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperations {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		//Filter
		System.out.println("Print all Values starting with A");
		memberNames.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

		//Filter and Stream.map
		System.out.println("Print all Values starting with A in Capital case");
		memberNames.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		// Stream sorted
		System.out.println("Print all Values sorted");
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}
}
