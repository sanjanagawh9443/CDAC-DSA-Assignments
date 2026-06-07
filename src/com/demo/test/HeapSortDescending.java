
package com.demo.test;

import java.util.Arrays;

public class HeapSortDescending {

    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        heapSortDescending(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void heapSortDescending(int[] arr) {
        int n = arr.length;

        // Build Min Heap (smallest element at the root)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (smallest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int smallest = i; // Initialize smallest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is smaller than root
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // If right child is smaller than smallest so far
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If smallest is not root, swap and continue heapifying
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            heapify(arr, n, smallest);
        }
    }
}
