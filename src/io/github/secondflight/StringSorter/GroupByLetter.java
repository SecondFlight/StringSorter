package io.github.secondflight.StringSorter;

import io.github.secondflight.util.Counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupByLetter {
	public static List<String> groupByLetter (List l, Counter c) {
		List<String> list = new ArrayList<String>(l);
		List<String> firstLetterList = new ArrayList<String>(Arrays.asList("a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ")));
		
		List<String> finalList = new ArrayList<String>();
		
		for (String s : firstLetterList) {
			List<String> letterList = new ArrayList<String>();
			for (String string : list) {
				if (string.substring(0, 1).equalsIgnoreCase(s)) {
					letterList.add(string);
					c.add();
				}
			}
			finalList.addAll(letterList);
		}
		
		return finalList;
	}
}
