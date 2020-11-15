package com.learn.equals_hashcode;

public class Car {

	@Override
	public int hashCode() {
		System.out.println("In Hashcode method");
		return 1;
	}

	/*
	 *  If euals method is overridden it calls the Object class equals method
	 */
	
//	@Override
//	public boolean equals(Object car) {
//		System.out.println("In Equals method");
//		if (car != null && car instanceof Car) {
//			return true;
//		}
//		return false;
//	}
}
