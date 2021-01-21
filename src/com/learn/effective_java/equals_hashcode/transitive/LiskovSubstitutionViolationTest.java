package com.learn.effective_java.equals_hashcode.transitive;

public class LiskovSubstitutionViolationTest {

	public static void main(String[] args) {
		
		CounterPoint cp = new CounterPoint(0, 1);
		
		/*
		 * Instead of getClass if it uses instanceOf the onUnitCircle will
		 * work fine
		 * 
		 * Here it will return false as collections Set used equals method to 
		 * check for containment
		 */
		System.out.println(cp.onUnitCircle(cp));
	}
}
