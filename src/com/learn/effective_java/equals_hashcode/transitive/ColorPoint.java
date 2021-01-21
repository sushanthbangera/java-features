package com.learn.effective_java.equals_hashcode.transitive;

import com.learn.effective_java.equals_hashcode.Color;

/*
 * Add value component without violating the equals contract
 */
public class ColorPoint {

	private final Point point;

	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		if (color == null)
			throw new NullPointerException();

		this.point = new Point(x, y);
		this.color = color;
	}

	/*
	 * Returns the point-view of this color point
	 */
	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint)) {
			return false;
		}
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color.equals(color);
	}
	
	// .. remainder omitted
}
