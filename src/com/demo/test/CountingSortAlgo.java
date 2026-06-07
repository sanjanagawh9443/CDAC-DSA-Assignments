package com.demo.test;

import java.util.Arrays;

public class CountingSortAlgo {
	
            public static void main(String[] args) {
	        int[] arr = {4, 9, 8, 5, 4}; // Example with a duplicate (4)
	        int[] sortedArray = countingSort(arr);
	        
	        System.out.println("Final Sorted Output:");
	        System.out.println(Arrays.toString(sortedArray));
	    }

	    public static int[] countingSort(int[] arr) {
	        // find max
	        int maxnum = findMax(arr);
	        
	        // create a array of size max+1
	        int[] countarr = new int[maxnum + 1];
	        
	        // find number of occurrences
	        for (int i = 0; i < arr.length; i++) {
	            int pos = arr[i];
	            countarr[pos]++;
	        }
	        
	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Count array: " + Arrays.toString(countarr));

	        // find cumulative sum
	        for (int i = 1; i < countarr.length; i++) {
	            countarr[i] = countarr[i] + countarr[i - 1];
	        }
	        System.out.println("Cumulative sum array: " + Arrays.toString(countarr));

	        int[] output = new int[arr.length];
	        
	        // Iterate backwards to maintain stability
	        for (int i = arr.length - 1; i >= 0; i--) {
	            int val = arr[i];
	            countarr[val]--;   
	            int idx = countarr[val];
	            output[idx] = val;
	        }
	        return output;
	    }

	    private static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (max < arr[i]) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
	}



