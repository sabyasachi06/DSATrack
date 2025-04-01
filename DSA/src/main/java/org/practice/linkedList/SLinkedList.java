package org.practice.linkedList;

public class SLinkedList {

    Node head;
    Node tail;
    int length;

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public SLinkedList (){

    }
    public SLinkedList(int val) {
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public SLinkedList(int[] val) {
        Node newNode = new Node(val[0]);
        head = newNode;
        tail = newNode;
        length = 1;
        for (int i = 1; i < val.length; i++) {
            addFirst(val[i]);
        }
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeLast(int val) {

    }

    public void removeFirst(int val) {

    }

    public void printListSLL() {
        SLinkedList.Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
        System.out.println("head :" + (head != null ? head.val : "list is empty"));
        System.out.println("tail :" + (tail != null ? tail.val : null));
        System.out.println("length :" + length);
    }
}
