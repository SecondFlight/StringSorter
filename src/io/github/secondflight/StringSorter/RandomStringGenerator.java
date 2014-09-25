package io.github.secondflight.StringSorter;

import java.util.ArrayList;
import java.util.List;

public class RandomStringGenerator {
	public static String randomString (int length) {
		String s = "";
		
		String characters = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 1; i <= length; i++) {
			int randomNumber = randomNumber(0, 25);
			s = s + characters.charAt(randomNumber);
		}
		
		return s;
	}
	
	public static List<String> randomStringList (int length) {
		List<String> stringList = new ArrayList<String>();
		
		for (int i = 1; i <= length; i++) {
			stringList.add(randomString (randomNumber(1, 10)));
		}
		
		return stringList;
	}
	
	public static int randomNumber(int lower, int upper) {
		return lower + (int)(Math.random() * ((upper - lower) + 1));
	}
}
