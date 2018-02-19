package com.counting_180219;

public class CC {
	public static int charCount(String str, char c) {
		String upStr = str.toUpperCase();
		char upChar = Character.toUpperCase(c);
		int count = 0;

		for (int i = 0; i < upStr.length(); i++) {
			if (upStr.charAt(i) == upChar)
				count++;
		}
		return count;
	}
}
