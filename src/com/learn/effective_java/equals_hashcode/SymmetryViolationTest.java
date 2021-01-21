package com.learn.effective_java.equals_hashcode;

import java.util.ArrayList;
import java.util.List;

public class SymmetryViolationTest {

	public static void main(String[] args) {
		
		CaseInsensitiveString cis =  new CaseInsensitiveString("Polish");
		String s = "polish";
		
		System.out.println(cis.equals(s));
		
		System.out.println(s.equals(cis));
		
		List<CaseInsensitiveString> list = new ArrayList<>();
		System.out.println(list.add(cis));
	}
}
