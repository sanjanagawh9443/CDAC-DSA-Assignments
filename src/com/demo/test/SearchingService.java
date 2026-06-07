
package com.demo.test;

public class SearchingService {

    // Must be static to call it without creating an object
    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchNonRecurssive(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecurssive(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) return mid;
        if (arr[mid] < key) return binarySearchRecurssive(arr, key, mid + 1, high);
        return binarySearchRecurssive(arr, key, low, mid - 1);
    }
}
