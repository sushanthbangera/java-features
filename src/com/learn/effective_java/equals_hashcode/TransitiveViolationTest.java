package com.learn.effective_java.equals_hashcode;

public class TransitiveViolationTest {

	public static void main(String[] args) {

		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);

		System.out.println("Testing Symmetry Violation");
		System.out.println(p.equals(cp));

		System.out.println(cp.equals(p));

		
		// Solving symmetry but violates transitivity
		
		System.out.println("Solving symmetry");
		
		ColorPoint2 cpRed = new ColorPoint2(1, 2, Color.RED);
		System.out.println(p.equals(cpRed));

		System.out.println(cpRed.equals(p));
		
		System.out.println("Testing transitivity Violation");
		
		ColorPoint cpBlue = new ColorPoint(1, 2, Color.BLUE);
		
		System.out.println(p.equals(cpRed));

		System.out.println(p.equals(cpBlue));
		
		System.out.println(cpRed.equals(cpBlue));
		
	}
}
