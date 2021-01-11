package com.learn.utils;

public class StopWatch {

	private static Long timeInMillis;

	private StopWatch() {
		timeInMillis = System.currentTimeMillis();
	}

	public static StopWatch createStarted() {
		return new StopWatch();
	}

	public String stop() {
		return (System.currentTimeMillis() - timeInMillis) + " ms";
	}
}
