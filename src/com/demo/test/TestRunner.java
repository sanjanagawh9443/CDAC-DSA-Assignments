
package com.demo.test;

public class TestRunner {

    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 23, 2, 10, 51};
        int pos = SearchingService.sequentialSearch(arr, 23);
        
        if (pos != -1)
            System.out.println("number found at : " + pos);
        else
            System.out.println("not found");

        int[] arr1 = {5, 7, 12, 15, 26, 31, 33, 34, 38, 56, 67, 77, 78, 89};
        
        // REMOVED 'int' here
        pos = SearchingService.binarySearchNonRecurssive(arr1, 31); 
        if (pos != -1)
            System.out.println("number found at : " + pos);
        else
            System.out.println("not found");

        // REMOVED 'int' here
        pos = SearchingService.binarySearchRecurssive(arr1, 31, 0, 13);
        if (pos != -1)
            System.out.println("number found at : " + pos);
        else
            System.out.println("not found");
    }
}
