package io.github.secondflight.StringSorter;

import io.github.secondflight.util.Counter;
import io.github.secondflight.util.Words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Counter c = new Counter ();
		
		List<String> unsorted = RandomStringGenerator.randomStringList(100);
		//List<String> unsorted = Words.getList();
		
		/* isDone = false;
		
		while (!isDone) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Press enter to continue. Type any character and press enter to exit.");
        	String s = br.readLine();
        
        	if (s.equalsIgnoreCase("")) {
        		List<String> processed = SimpleSorter.singleIteration2(unsorted);
        		unsorted = processed;
        		
        		for (String item : processed) {
        			System.out.println(item);
        		}
        		System.out.println();
        	} else {
        		isDone = true;
        	}
		}*/
		
		/*
		System.out.println();
		System.out.println("Unsorted:");
		System.out.println();
	
		for (String s : unsorted) {
			System.out.println(s);
		}
		*/
		
		System.out.println();
		System.out.println("Sorted:");
		System.out.println();
		
		List<String> processed = GroupByLetter.groupByLetter(unsorted, c);
		
		processed = SimpleSorter.simpleSorter(processed, c);
		
		for (String s : processed) {
			System.out.println(s);
		}
		
		
		
		System.out.println();
		System.out.println("Iterations:");
		System.out.println(c.getValue());
	}

}
