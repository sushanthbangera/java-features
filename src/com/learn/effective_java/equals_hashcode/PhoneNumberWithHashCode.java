package com.learn.effective_java.equals_hashcode;

public class PhoneNumberWithHashCode {

	private final short areaCode;

	private final short prefix;

	private final short lineNumber;

	public PhoneNumberWithHashCode(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area-code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max) {
			throw new IllegalArgumentException(name + ": " + arg);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}

		if (!(o instanceof PhoneNumberWithHashCode)) {
			return false;
		}
		PhoneNumberWithHashCode pn = (PhoneNumberWithHashCode) o;
		return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		return result;
	}
}
