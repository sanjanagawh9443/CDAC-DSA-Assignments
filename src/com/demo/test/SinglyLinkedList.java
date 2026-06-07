
package com.demo.test;

public class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        
        }
    }

    public SinglyLinkedList() {
        head = null;
    }

    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addByPosition(int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; temp != null && i <= pos - 2; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Cannot add position is out of scope");
            }
        }
    }

    public void addAfterNum(int val, int num) {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node temp = head;
            Node newNode = new Node(val);
            while (temp != null && temp.data != num) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println(num + " not found");
            }
        }
    }

    public void deleteByValue(int val) {
        if (head == null) { // Added safety check
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        if (head.data == val) {
            head = head.next;
            temp.next = null;
        } else {
            Node prev = null;
            while (temp != null && temp.data != val) {
                prev = temp;
                temp = temp.next;
            }
            if (temp != null) {
                prev.next = temp.next;
                temp.next = null;
            } else {
                System.out.println(val + " not found");
            }
        }
    }

    public void deleteByPosition(int pos) {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node temp = head;
            if (pos == 1) {
                head = head.next;
                temp.next = null;
            } else {
                Node prev = null;
                for (int i = 1; temp != null && i <= pos - 1; i++) {
                    prev = temp;
                    temp = temp.next;
                }
                if (temp != null) {
                    prev.next = temp.next;
                    temp.next = null;
                } else {
                    System.out.println("position is beyond the limit");
                }
            }
        }
    }

    public void displayData() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + "------>");
            }
            System.out.println("null");
        }
    }

    // MAIN METHOD TO RUN THE CODE
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Adding 10, 20, 30:");
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.displayData();

        System.out.println("\nAdding 15 at position 2:");
        list.addByPosition(15, 2);
        list.displayData();

        System.out.println("\nAdding 25 after number 20:");
        list.addAfterNum(25, 20);
        list.displayData();

        System.out.println("\nDeleting value 20:");
        list.deleteByValue(20);
        list.displayData();

        System.out.println("\nDeleting position 1:");
        list.deleteByPosition(1);
        list.displayData();
    }
}
