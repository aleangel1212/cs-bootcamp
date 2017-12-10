// Alessandro Vecchi
// Sun Dec 10, 2017

// ====================
// ContainerWithMostWater: ContainerWithMostWater.java
// ====================
// Problem: Given an array of integers, return the area of
// the container that the line between them and the 
// x axis is a the container with the most water
import java.io.*;
import java.util.*;

class ContainerWithMostWater {
	public static int largestContainer(int[] array) {
		int left = 0;
		int right = array.length - 1;
		int max = 0;

		while(left < right) {
			int height = Math.min(array[left], array[right]);
			int width = right - left;

			if(height * width > max)
				max = height * width;

			if(array[right] > array[left])
				left++;
			else
				right--;
		}

		return max;
	}
}