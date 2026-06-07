
package com.demo.test;

import java.util.stream.IntStream;

public class BubbleSortAlog {

    public static void main(String[] args) {
        int[] arr = {21, 2, 5, 1, 7, 8, 10, 3};
        
        
        BubbleSortAlog.bubbleSortDescending(arr);
        
        IntStream.of(arr).forEach(n -> System.out.println(n));
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
