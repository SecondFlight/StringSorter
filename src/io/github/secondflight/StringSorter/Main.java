package io.github.secondflight.StringSorter;

import io.github.secondflight.util.Counter;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Counter c = new Counter ();
		
		List<String> unsorted = RandomStringGenerator.randomStringList(100);
		
		System.out.println();
		System.out.println("Unsorted:");
		System.out.println();
		
		for (String s : unsorted) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorted:");
		System.out.println();
		
		List<String> processed = SimpleSorter.simpleSorter(unsorted, c);
		for (String s : processed) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Iterations:");
		System.out.println(c.getValue());

	}

}
