// Alessandro Vecchi
// Sat Dec 9, 2017

// ====================
// TwoSum: TwoSum.java
// ====================
// Problem: Given an array of integers, return two numbers
// such that they add up to a specific target
import java.io.*;
import java.util.*;

class TwoSum {
	public static int[] twoSum(int[] array, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for(int i = 0; i < array.length; i++) {
			if(hm.containsKey(sum - array[i]))
				return new int[]{hm.get(sum - array[i]), i};
			hm.put(array[i], i);
		}

		return null;
	}
}