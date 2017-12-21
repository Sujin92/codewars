package com.smileface_20171221;

import java.util.List;

public class SmileFaces {

	public static int countSmileys(List<String> arr) {
		// Just Smile :)
		int size = arr.size();
		int count = 0;
		String smile = null;
		char nose = '\u0000';
		char mouth = '\u0000';
		char eyes = '\u0000';
		for (int i = 0; i < size; i++) {
			smile = arr.get(i);
			eyes = smile.charAt(0);

			if (smile.length() <= 3 && (eyes == ':' || eyes == ';')) {
				if (smile.length() > 2) {
					nose = smile.charAt(1);
					mouth = smile.charAt(2);

					if ((nose == '-' || nose == '~') && (mouth == ')' || mouth == 'D')) {
						count++;
					}

				}
				if (smile.length() == 2) {
					mouth = smile.charAt(1);

					if (mouth == ')' || mouth == 'D') {
						count++;
					}
				}
			}
		}

		return count;
	}
}
