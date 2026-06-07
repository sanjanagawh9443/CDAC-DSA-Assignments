
package com.demo.test;

import java.util.Arrays;

public class BubbleSortAscending {

    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 2}; 
        bubbleSortAscending(arr);
    }

    public static void bubbleSortAscending(int[] arr) {
        // Outer loop runs for each element
        for(int i=0; i < arr.length; i++) {
            int count = 0;
            // Inner loop performs the actual swaps
            for(int j=1; j < arr.length - i; j++) {
                // CHANGED: Use '>' to move larger elements to the right
                if(arr[j-1] > arr[j]) { 
                    // swap elements
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
            System.out.println("iteration : " + i + " swap count: " + count);
            System.out.println(Arrays.toString(arr));
        }
    }
}
