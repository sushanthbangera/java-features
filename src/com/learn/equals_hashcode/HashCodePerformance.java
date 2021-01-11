package com.learn.equals_hashcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.learn.utils.StopWatch;

public class HashCodePerformance {
	
	public static void main(String[] args) {
		Set<String> stringHashSet = new HashSet<>();
		stringHashSet.add("London");
		stringHashSet.add("Mumbai");
		stringHashSet.add("NewYork");

		/*
		 *  hashcode of "f5a5a608" is 0
		 *  Hashcode caches only non zero hashcodes, so for string with hashcode 0
		 *  it generates the hashcode everytime
		 */
		List<String> stringsToSearch = Arrays.asList("f5a5a608", "48abre7a6 i8a5r507", "7e50bc488 pl43fvf1p 65",
				"e843r6f1p vfvdfv vdvdg vgbgd ", "38aeaf9a6");

		for (String string : stringsToSearch) {
			StopWatch timer = StopWatch.createStarted();
			System.out.println("for string: " +string + ", hashcode is " + string.hashCode());
			for (int index = 0; index < 10000000; ++index) {
				stringHashSet.contains(string);
			}
			System.out.println("Search String \"" + string + "\" time taken " + timer.stop());
		}
		
		/*
		 *  for string: f5a5a608, hashcode is 0
			Search String "f5a5a608" time taken 27 ms
			for string: 48abre7a6 i8a5r507, hashcode is 398427321
			Search String "48abre7a6 i8a5r507" time taken 33 ms
			for string: 7e50bc488 pl43fvf1p 65, hashcode is 1428328795
			Search String "7e50bc488 pl43fvf1p 65" time taken 40 ms
			for string: e843r6f1p vfvdfv vdvdg vgbgd , hashcode is 1588972936
			Search String "e843r6f1p vfvdfv vdvdg vgbgd " time taken 28 ms
			for string: 38aeaf9a6, hashcode is 0
			Search String "38aeaf9a6" time taken 107 ms
		 */
	}
}
