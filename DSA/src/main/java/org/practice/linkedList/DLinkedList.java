package org.practice.linkedList;


public class DLinkedList {
    Node head;
    Node tail;
    int length;

     class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public DLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
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
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void removeFirst() {
        if (length == 0) {
            return;
        }
        if (length == 1) {
            head.next = null;
            head.prev = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        length--;
    }

    public void removeLast() {
        if (length == 0) {
            return;
        }
        if (length == 1) {
            tail.next = null;
            tail.prev = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        length--;
    }

    public Node getNode(int index){
         // get the node value if the index is provided.
        return null;
    }

    public boolean setNode(int index, int val){
         // set the value of the node in the given index
         return false;
    }

    public boolean insertNode(int index,int val){
         // insert newnode after the given index with the given value.
         return false;
    }

    public void reverseList(){
         // reverse a given linked list
    }

    public void printList() {
        Node temp = head;
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
