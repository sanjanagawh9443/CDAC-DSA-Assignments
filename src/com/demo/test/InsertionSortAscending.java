package com.demo.test;

import java.util.Arrays;

public class InsertionSortAscending {
	
	public static void main(String[] args) {
		int[] arr = {9,5,1,4,3};
		insertionsortAscending(arr);
	}
	
	public static void insertionsortAscending(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			
			while ((j >= 0) && (arr[j] > key)) {
				arr [j+1] = arr [j];
				j--;
			}
				arr [j+1] = key;
				
				System.out.println(Arrays.toString(arr));
			}
		}
	}

