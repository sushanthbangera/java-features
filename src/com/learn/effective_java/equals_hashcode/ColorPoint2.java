package com.learn.effective_java.equals_hashcode;

public class ColorPoint2 extends Point {

	private final Color color;

	public ColorPoint2(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	/*
	 * Broken - Violates Symmetry
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}

		// If o is a normal Point, do a color blind comparison
		if (!(o instanceof ColorPoint2)) {
			return o.equals(this);
		}

		return super.equals(o) && ((ColorPoint2) o).color == color;
	}
}
