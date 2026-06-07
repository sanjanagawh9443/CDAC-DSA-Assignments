
package com.demo.test;

import java.util.Arrays;

public class TestSorting {
    public static void main(String[] args) {
        // 1. Create the data
        int[] data = {21, 2, 5, 1, 7, 8, 10, 3};
        
        // 2. Call the method below to start the work
        improvebubbleSort(data);
        
        // 3. Print the final result
        System.out.println("Final Sorted Array: " + Arrays.toString(data));
    }
    
    public static void improvebubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean flag = false;
            // FIXED: added '- i' to avoid re-checking sorted elements
            for(int j = 1; j < arr.length - i; j++) { 
                if(arr[j - 1] > arr[j]) {
                    count++;
                    flag = true;
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("iteration : " + i + " swap count: " + count);
            System.out.println(Arrays.toString(arr));
            if (!flag) {
                break;
            }
        }
    }
}
