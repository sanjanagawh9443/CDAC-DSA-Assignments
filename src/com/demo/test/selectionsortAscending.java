package com.demo.test;

import java.util.Arrays;

public class selectionsortAscending {
	
	public static void main(String[] args) {
		int[] arr =  {5,6,9,2};
		System.out.println("Before: " + Arrays.toString (arr));
		selectionsortAscending(arr);
		
		System.out.println("After: " + Arrays.toString(arr));
	}
		
		public static void selectionsortAscending(int[] arr) {
			
			for (int i = 0; i<arr.length; i++) {
				int minpos= findmin (arr,i);
				int temp = arr [i];
				arr[i] = arr [minpos];
				arr [minpos] = temp;
				
				System.out.println("step" + (i + 1) + ":" + Arrays.toString(arr));
			}
		}
		private static int findmin(int[] arr, int start) {
			int minpos = start;
			for(int i =start; i<arr.length;i++) {
				if(arr[i] < arr [minpos]) {
					minpos = i;
				}
			}
			return minpos;
		}
	}
	
	