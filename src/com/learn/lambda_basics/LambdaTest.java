package com.learn.lambda_basics;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
	
	public void processTask(Task task) {
		task.perform();
	}

	public static void main(String[] args) {
		
		Task myTask = () -> System.out.println("My Hello world");
		myTask.perform();
		
		LambdaTest lambdaTest = new LambdaTest();
		lambdaTest.processTask(myTask);
		lambdaTest.processTask(() -> System.out.println("This Hello world"));
		
		Task printTask = new Print();
		printTask.perform();
		
		Task inTask = new Task() {
			
			@Override
			public void perform() {
				System.out.println("Inner Hello world");
			}
		};
		inTask.perform();
		
		String arr[] = {"3", "30", "34", "9", "5"};
		
		Comparator<String> comp = (a , b) -> {
			String s1 = a + b;
			String s2 = b + a;
			
			return s2.compareTo(s1);
		};
		
		Arrays.sort(arr, comp);
		
		System.out.println(Arrays.toString(arr));
	}
}
