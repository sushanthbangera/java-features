package com.learn.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceTest {

	public void action(Action action) {
		action.run("Welcome to Functional Interface");
	}

	public static void main(String[] args) {
		FunctionalInterfaceTest fnInterface = new FunctionalInterfaceTest();

		fnInterface.action(s -> System.out.println("* -- " + s + " --*"));

		fnInterface.action(new Action() {
			@Override
			public void run(String s) {
				System.out.println("* -- " + s + " --*");
			}
		});
		
		
		Comparator<Integer> myComparator = (a, b) -> a - b;
		
		System.out.println(myComparator.compare(2, 5));
		
		List<Integer> myList = Arrays.asList(new Integer[] {3, 5, 1, 4, 7, 6});
		
		System.out.println(myList.toString());
		
		Collections.sort(myList, myComparator);
		
		System.out.println(myList.toString());
	}
	
	
}
