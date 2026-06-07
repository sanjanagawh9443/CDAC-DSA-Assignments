
package com.demo.arrays;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        MyArray ob = new MyArray();
        
        System.out.println("Initial Capacity: " + ob.getCapacity());
        
        ob.add(4);
        ob.add(5);
        ob.add(8, 1);
        ob.add(9, 1);
        
        System.out.println("Current Array: " + ob);
        System.out.println("Position of 9: " + ob.searchByValue(9));
        
        ob.deleteByValue(5);
        System.out.println("After deleting 5: " + ob);
        
        // Testing Reverse
        int[] rev = ob.reverseArray();
        System.out.println("Reversed Array: " + Arrays.toString(rev));
        
        // Testing Exchange
        int[] exchanged = ob.exchangeIndexValue();
        System.out.println("Exchanged (Value becomes Index): " + Arrays.toString(exchanged));
    }
}
