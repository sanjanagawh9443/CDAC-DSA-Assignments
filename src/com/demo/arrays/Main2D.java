
package com.demo.arrays;

import java.util.Scanner;

public class Main2D {
    public static void main(String[] args) {
        // 1. Create first matrix (default 3x3)
        System.out.println("--- Matrix 1 ---");
        TestMy2DArray m1 = new TestMy2DArray();
        m1.acceptData();

        // 2. Create second matrix (default 3x3)
        System.out.println("\n--- Matrix 2 ---");
        TestMy2DArray m2 = new TestMy2DArray();
        m2.acceptData();

        // 3. Display original matrices
        System.out.println("\nMatrix 1:");
        m1.displayData();
        System.out.println("\nMatrix 2:");
        m2.displayData();

        // 4. Perform Addition
        System.out.println("\nResult of Matrix Addition:");
        int[][] sumResult = m1.add2DArray(m2);
        TestMy2DArray sumMatrix = new TestMy2DArray(sumResult);
        sumMatrix.displayData();

        // 5. Test Rotation (Example: Rotate row 0 to the right)
        System.out.println("\nMatrix 1 after rotating Row 0 to the right:");
        m1.rowRotate(true, 0);
        m1.displayData();

        // 6. Test Column Rotation (Example: Rotate column 1 down)
        System.out.println("\nMatrix 1 after rotating Column 1 down:");
        m1.columnRotate(true, 1);
        m1.displayData();
    }
}
