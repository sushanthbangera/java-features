package com.learn.effective_java.innerclass;

public class Calculator {

	public static Operation operation;
	
	private int add(int num1, int num2) {
		return num1 + num2;
	}

	private int subtract(int num1, int num2) {
		return num1 - num2;
	}

	private int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int calculate(Operation op, int num1, int num2) {

		switch (op) {
		case PLUS:
			return add(num1, num2);
		case MINUS:
			return subtract(num1, num2);
		case PRODUCT:
			return multiply(num1, num2);
		default:
			return -1;
		}
	}

}
