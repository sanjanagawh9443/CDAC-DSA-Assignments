
package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
    private int[] arr;
    private int size;
    private int capacity;

    // --- Constructor and Methods ---
    public MyArray() {
        this.capacity = 10;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(int val) {
        if (size == capacity) grow();
        arr[size++] = val;
    }

    public void add(int val, int index) {
        if (index < 0 || index > size) return;
        if (size == capacity) grow();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
        size++;
    }

    public int searchByValue(int val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    public void deleteByValue(int val) {
        int index = searchByValue(val);
        if (index != -1) deleteByPosition(index);
    }

    public void deleteByPosition(int index) {
        if (index < 0 || index >= size) return;
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public int[] exchangeIndexValue() {
        int maxVal = 0;
        for(int i=0; i<size; i++) if(arr[i] > maxVal) maxVal = arr[i];
        
        int[] newArr = new int[maxVal + 1];
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 0) {
                newArr[arr[i]] = i;
            }
        }
        return newArr;
    }

    public int[] reverseArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[size - 1 - i];
        }
        return result;
    }

    private void grow() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }

    // --- MAIN METHOD ADDED HERE ---
    public static void main(String[] args) {
        MyArray ob = new MyArray();
        
        System.out.println("--- Testing MyArray ---");
        ob.add(10);
        ob.add(20);
        ob.add(30);
        System.out.println("Array after adds: " + ob);
        
        ob.add(15, 1);
        System.out.println("After adding 15 at index 1: " + ob);
        
        System.out.println("Position of 20: " + ob.searchByValue(20));
        
        ob.deleteByValue(10);
        System.out.println("After deleting value 10: " + ob);
        
        int[] reversed = ob.reverseArray();
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
    }
}
