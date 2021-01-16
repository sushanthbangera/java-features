package com.learn.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMatches {

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

		boolean isAnySPrsent = memberNames.stream().anyMatch(s -> s.startsWith("S"));
		System.out.println(isAnySPrsent);

		String firstS = memberNames.stream().filter(s -> s.startsWith("S")).findFirst().get();
		System.out.println(firstS);
		
		isAnySPrsent = memberNames.stream().allMatch(s -> s.startsWith("S"));
		System.out.println(isAnySPrsent);
	}
}
