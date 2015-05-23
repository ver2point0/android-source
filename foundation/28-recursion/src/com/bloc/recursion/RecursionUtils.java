package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		if (numbers.size() == 1) {
			return numbers.get(0);
		}
		if (numbers.size() >= 2) {
			if (numbers.get(numbers.size() - 1) > numbers.get(0)) {
				numbers.remove(0);
			}
			else {
				numbers.remove(numbers.size() - 1);
			}
		}
		return findMaxRecursively(numbers);
	}
}