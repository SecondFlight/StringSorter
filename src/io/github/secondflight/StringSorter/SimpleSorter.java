package io.github.secondflight.StringSorter;

import io.github.secondflight.util.Alphabet;
import io.github.secondflight.util.Counter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSorter {
	public static List<String> simpleSorter (List<String> stringList, Counter c) {
		
		List<String> list = new ArrayList<String>(stringList);
		
		boolean loopIsDone = false;
		int iterations = 0;
		
		int maxLength = 0;
		for (String item : list) {
			if (maxLength < item.length()) {
				maxLength = item.length();
			}
		}
		
		while (iterations < 100) {
			loopIsDone = false;
			
			List<String> compareList = new ArrayList<String>(list);
			
			singleIteration (list, c);
			
			if (list.equals(compareList)) {
				loopIsDone = true;
			}
			
			if (loopIsDone) {
				break;
			}
			iterations ++;
		}
		return list;
	}	
	
	public static List<String> singleIteration (List<String> list, Counter c) {
		List<String> stringList = new ArrayList<String>(list);
		
		for (String s : list) {
			if (list.indexOf(s) + 1 <= list.size() - 1) {
				String itemOne = s;
				String itemTwo = list.get(list.indexOf(s) + 1);
				int maxLength;
				if (itemOne.length() > itemTwo.length()) {
					maxLength = itemOne.length();
				} else {
					maxLength = itemTwo.length();
				}
				
				for (int i = 0; i < maxLength - 1; i++) {
					int numberOne;
					int numberTwo;
					
					if (i + 1 <= itemOne.length()) {
						numberOne = Alphabet.lettersToNumbers(itemOne.substring(i, i + 1));
					} else {
						numberOne = 0;
					}
					
					if (i + 1 <= itemTwo.length()) {
						numberTwo = Alphabet.lettersToNumbers(itemTwo.substring(i, i + 1));
					} else {
						numberTwo = 0;
					}
					
					if (numberOne > numberTwo) {
						Collections.swap(list, list.indexOf(s), list.indexOf(s) + 1);
						c.add();
						break;
					} else if (numberOne < numberTwo) {
						break;
					}
				}
			}
		}
		
		return stringList;
	}
		
	
}
