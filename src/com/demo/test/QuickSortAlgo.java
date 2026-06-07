
package com.demo.test;

import java.util.Arrays;

public class QuickSortAlgo {

    public static void main(String[] args) {
        int[] arr = {4, 9, 8, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("-------------------------------------------------");
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Final Sorted Array: " + Arrays.toString(arr));
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
        int pivotValue = arr[start]; // Store original pivot value for printing
        int i = start;
        int j = end;

        while (i < j) {
            while ((i < end) && (arr[i] <= arr[pivot])) {
                i++;
            }
            while ((j > start) && (arr[j] > arr[pivot])) {
                j--;
            }
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

        // Corrected print statements to show what actually happened
        System.out.println(Arrays.toString(arr));
        System.out.println("Pivot position  : " + j + " pivot number : " + arr[j]);
        System.out.println(arr[j] + " pivot number was swapped with " + arr[start]);
        System.out.println("-------------------------------------------------");
        return j;
    }
}
