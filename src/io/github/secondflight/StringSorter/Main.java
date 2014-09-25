package io.github.secondflight.StringSorter;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = RandomStringGenerator.randomStringList(20);
		
		System.out.println();
		System.out.println("Unsorted:");
		System.out.println();
		
		for (String s : unsorted) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorted:");
		System.out.println();
		
		List<String> processed = SimpleSorter.simpleSorter(unsorted);
		for (String s : processed) {
			System.out.println(s);
		}

	}

}
