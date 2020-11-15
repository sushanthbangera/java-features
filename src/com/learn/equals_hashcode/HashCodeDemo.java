package com.learn.equals_hashcode;

public class HashCodeDemo {

	public static void main(String[] args) {
		
		// == always checks the references hence it would return false
		System.out.println(new Car() == new Car());
		
		Car a = new Car();
		
		Car b = new Car();
		
		System.out.println(a);
		System.out.println(b);
		
		// this checks the equals method, default equals method uses "==" so its false
		System.out.println(a.equals(b));
		
		// == always checks the references hence it would return false
		System.out.println(new Object() == new Object());
		
		//
		System.out.println(new Object().equals(new Object()));
	}
}
