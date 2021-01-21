package com.learn.effective_java.equals_hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {

	public static void main(String[] args) {
		
		Map<PhoneNumber, String> phMap = new HashMap<>();
		phMap.put(new PhoneNumber(707, 867, 5309), "Jenny");
		
		/*
		 * Since hashcode is not overridden two instance will generate 2 different
		 * hashcode this below output would be null.
		 */
		System.out.println(phMap.get(new PhoneNumber(707, 867, 5309)));
		
		
		Map<PhoneNumberWithHashCode, String> phMap2 = new HashMap<>();
		phMap2.put(new PhoneNumberWithHashCode(707, 867, 5309), "Jenny");
		
		/*
		 * returns "Jenny"
		 */
		System.out.println(phMap2.get(new PhoneNumberWithHashCode(707, 867, 5309)));
	}
}
