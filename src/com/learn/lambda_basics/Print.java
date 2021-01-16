package com.learn.lambda_basics;

public class Print implements Task {

	@Override
	public void perform() {
		System.out.println("Hello World!");
	}

}
