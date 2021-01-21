package com.learn.effective_java.equals_hashcode;

public class CaseInsensitiveString {

	private final String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}
	
	/*
	 * Broken - violates Symmetry
	 */
	@Override
	public boolean equals(Object o) {
		System.out.println("Calling the CaseInsensitiveString Equals");
		if (o instanceof CaseInsensitiveString) {
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		}
		if (o instanceof String) {
			return s.equalsIgnoreCase((String) o);
		}
		return false;
	}
	
	/*
	 * Correct way which removes the ill-conceived attempt to interoperate with string
	 * from the equals method
	 */
//	@Override
//	public boolean equals(Object o) {
//		return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o). s.equals(s);
//	}
	
}
