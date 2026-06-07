
package com.demo.test;

import java.util.Arrays;

public class TestQuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("-----------------");
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = start;
        int i = start;
        int j = end;
        
        while (i < j) {
            while ((i < end) && (arr[i] <= arr[pivot])) i++;
            while ((j > start) && (arr[j] > arr[pivot])) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap pivot with j
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;

        // Print statements must be inside the method to work
        System.out.println(Arrays.toString(arr));
        System.out.println("pivot position : " + j + " pivot number: " + arr[j]);
        System.out.println(arr[j] + " pivot number was swapped with " + arr[start]);
        System.out.println("-----------------");
        
        return j; // Return j as the new pivot position
    }
}
