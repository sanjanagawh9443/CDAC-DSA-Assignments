
package com.demo.test;

import java.util.Arrays;

public class selectionsortdescending {
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 9, 2};
		System.out.println("Before: " + Arrays.toString(arr));
		
		// Calling the method
		selectionsortdescending(arr);
		
		System.out.println("After: " + Arrays.toString(arr));
	}
		
	public static void selectionsortdescending(int[] arr) {
		// We loop to length-1 because the last element will naturally be the smallest
		for (int i = 0; i < arr.length - 1; i++) {
			int maxpos = findmax(arr, i); 
			
			// Swap current index with the maximum value found
			int temp = arr[i];
			arr[i] = arr[maxpos];
			arr[maxpos] = temp;
			
			System.out.println("step" + (i + 1) + ":" + Arrays.toString(arr));
		}
	}

	private static int findmax(int[] arr, int start) {
		int maxpos = start;
		for (int i = start + 1; i < arr.length; i++) {
			// Using '>' to find the largest number for Descending order
			if (arr[i] > arr[maxpos]) { 
				maxpos = i;
			}
		}
		return maxpos;
	}
}
