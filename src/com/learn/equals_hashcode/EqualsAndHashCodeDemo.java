package com.learn.equals_hashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeDemo {

	public static void main(String[] args) {

		Student a = new Student(145, "Ram", 100);
		/*
		 * Hashcode method is called first, if the map contains any key with same hashcode 
		 * it calls the equals method
		 */
		Student b = new Student(145, "Ram", 100);
		
		Student c = new Student(055, "XYZ", 201);

		Map<Student, Integer> studentMarksMap = new HashMap<>();

		studentMarksMap.put(a, 100);

		/*
		 * This will invoke both hashcode and equals method
		 */
		studentMarksMap.put(b, 100);
		
		studentMarksMap.put(c, 100);
		
		System.out.println(studentMarksMap.size());

	}
}
