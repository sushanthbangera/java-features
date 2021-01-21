package com.learn.effective_java.equals_hashcode;

public class ColorPoint extends Point {

	private final Color color;
	
	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	/*
	 * if the equals method is ignored here it would inherit the implemention
	 * from the parent class i.e. Point which would ignore Color field for
	 * comparison
	 */
	
	/*
	 * Broken - Violates Transitivity
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint)) {
			return false;
		}
		
		return super.equals(o) && ((ColorPoint) o).color == color;
	}
}
