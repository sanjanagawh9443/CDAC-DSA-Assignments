package com.demo.test;

	public class TestSearch {

	    public static void main(String[] args) {
	        // 1. Sequential Search
	        int[] arr = {10, 4, 5, 23, 2, 10, 51};
	        int pos = SearchingService.sequentialSearch(arr, 23);
	        
	        System.out.println("--- Sequential Search ---");
	        if (pos != -1) System.out.println("Number found at index: " + pos);
	        else System.out.println("Not found");

	        // 2. Binary Search Non-Recursive
	        int[] arr1 = {5, 7, 12, 15, 26, 31, 33, 34, 38, 56, 67, 77, 78, 89};
	        pos = SearchingService.binarySearchNonRecurssive(arr1, 31);
	        
	        System.out.println("\n--- Binary Search (Iterative) ---");
	        if (pos != -1) System.out.println("Number found at index: " + pos);
	        else System.out.println("Not found");

	        // 3. Binary Search Recursive
	        pos = SearchingService.binarySearchRecurssive(arr1, 31, 0, arr1.length - 1);
	        
	        System.out.println("\n--- Binary Search (Recursive) ---");
	        if (pos != -1) System.out.println("Number found at index: " + pos);
	        else System.out.println("Not found");
	    }
	}


