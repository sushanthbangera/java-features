package com.learn.effective_java.equals_hashcode.transitive;

import java.util.HashSet;
import java.util.Set;

public class Point {

	private final int x;

	private final int y;
	
	private static final Set<Point> unitCircle;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/*
	 * Broken - violates Liskov substitution principle
	 * 
	 * equating objects only if their implementations are same
	 */
	@Override
	public boolean equals(Object o) {

		if (o == null || o.getClass() != getClass()) {
			return false;
		}
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
	
	static {
		unitCircle = new HashSet<>();
		unitCircle.add(new Point(1, 0));
		unitCircle.add(new Point(0, 1));
		unitCircle.add(new Point(-1, 0));
		unitCircle.add(new Point(0, -1));
	}
	
	public boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);
	}
}
