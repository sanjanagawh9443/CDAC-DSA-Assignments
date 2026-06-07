package com.demo.test;

// Ek hi class rakho jiska naam file ke naam se match kare (stack.java)
public class stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor ka naam ab 'stack' hoga (Outer class ke naam par)
    stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Main method ab direct outer class ke andar hai
    public static void main(String[] args) {
        stack st = new stack(5); // Object bhi 'stack' class ka banega
        st.push(10);
        st.push(20);
        System.out.println("Popped: " + st.pop()); 
    }
}
