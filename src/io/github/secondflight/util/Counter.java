package io.github.secondflight.util;

public class Counter {
	int i;
	public Counter () {
		i = 0;
	}
	
	/**
	 * Adds one to the counter.
	 */
	public void add () {
		i ++;
	}
	
	/**
	 * Gets the value of the counter.
	 * @return counter value.
	 */
	public int getValue () {
		return i;
	}
}
