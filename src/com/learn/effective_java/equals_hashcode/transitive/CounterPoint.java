package com.learn.effective_java.equals_hashcode.transitive;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * A class which doesn't add a value component
 * 
 * Just keeps track of how many instances are added
 */
public class CounterPoint extends Point {

	private static final AtomicInteger counter = new AtomicInteger();
	
	public CounterPoint(int x, int y) {
		super(x, y);
		counter.incrementAndGet();
	}
	
	public int numberCreated() {
		return counter.get();
	}
	
}
