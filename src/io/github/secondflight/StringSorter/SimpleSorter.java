package io.github.secondflight.StringSorter;

import io.github.secondflight.util.Alphabet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSorter {
	public static List<String> simpleSorter (List<String> stringList) {
		List<String> characters = new ArrayList<String>();
		
		String charactersString = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < 26; i++) {
			characters.add(Character.toString(charactersString.charAt(i)));
		}
		
		List<String> list = new ArrayList<String>(stringList);
		
		
		boolean loopIsDone = false;
		int iterations = 0;
		while (!loopIsDone && iterations < 200) {
			loopIsDone = true;
			for (int i = 0; i < list.size() - 1; i++) {
				if (Alphabet.lettersToNumbers(list.get(i).substring(0, 1)) < (Alphabet.lettersToNumbers(list.get(i + 1).substring(0, 1)))) {
					Collections.swap(list, i, i+1);
					loopIsDone = false;
				}
			}
			if (loopIsDone) {
				break;
			}
			iterations ++;
		}
		
		return list;
	}
	
	
}
