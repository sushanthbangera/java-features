package com.learn.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class HashMapValueSort {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 2);
		map.put("mango", 12);
		map.put("orange", 9);
		map.put("guava", 20);
		map.put("carrot", 6);

		Map<String, Integer> sortedMap = sortMapOnValues(map);

		sortedMap.entrySet().forEach(item -> {
			System.out.println(item.getKey() + " -> " + item.getValue());
		});
	}

	public static <T> Map<T, Integer> sortMapOnValues(Map<T, Integer> inMap) {

		PriorityQueue<Entry<T, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

		inMap.entrySet().forEach(item -> {
			pq.add(item);
		});

		Map<T, Integer> valueSortedMap = new LinkedHashMap<>();
		while (!pq.isEmpty()) {
			Entry<T, Integer> item = pq.poll();
			valueSortedMap.put(item.getKey(), item.getValue());
		}
		return valueSortedMap;
	}

}
