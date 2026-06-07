package com.demo.arrays;

import java.util.Scanner;

public class TestMy2DArray {
    private int[][] arr;
    private int rows, cols;

    // Default constructor (creates a 3x3 matrix)
    public TestMy2DArray() {
        this.rows = 3;
        this.cols = 3;
        this.arr = new int[rows][cols];
    }

    // Constructor for existing arrays (used in addition)
    public TestMy2DArray(int[][] data) {
        this.arr = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
      
    }

    public void displayData() {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public void rowRotate(boolean right, int rowIdx) {
        if (rowIdx < 0 || rowIdx >= rows) return;
        int[] targetRow = arr[rowIdx];
        if (right) {
            int last = targetRow[cols - 1];
            for (int j = cols - 1; j > 0; j--) {
                targetRow[j] = targetRow[j - 1];
            }
            targetRow[0] = last;
        }
    }

    public void columnRotate(boolean down, int colIdx) {
        if (colIdx < 0 || colIdx >= cols) return;
        if (down) {
            int last = arr[rows - 1][colIdx];
            for (int i = rows - 1; i > 0; i--) {
                arr[i][colIdx] = arr[i - 1][colIdx];
            }
            arr[0][colIdx] = last; // FIXED TYPO HERE
        }
    }

    public int[][] add2DArray(TestMy2DArray other) {
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = this.arr[i][j] + other.arr[i][j];
            }
        }
        return res;
    } 
}
