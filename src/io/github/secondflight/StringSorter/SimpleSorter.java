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
		
		for (int character = 0; character < maxLength; character++) {
			while (iterations < 10000) {
				loopIsDone = true;
				for (int i = 0; i < list.size() - 1; i++) {
					int letterOne;
					if (list.get(i).length() > character) {
						letterOne = Alphabet.lettersToNumbers(list.get(i).substring(character, character + 1));

					} else {
						letterOne = 0;
					}
					
					int letterTwo;
					if (list.get(i + 1).length() > character) {
						letterTwo = Alphabet.lettersToNumbers(list.get(i + 1).substring(character, character + 1));
					} else {
						letterTwo = 0;
					}
					
					if (letterOne > letterTwo) {
						Collections.swap(list, i, i+1);
						loopIsDone = false;
						c.add();
					}
				}
			
				if (loopIsDone) {
					break;
				}
				iterations ++;
			}
		}
		return list;
	}
	
	
}
