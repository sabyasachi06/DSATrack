package org.practice;


import org.practice.linkedList.DLinkedList;
import org.practice.linkedList.SLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DLinkedList ll = new DLinkedList(1);
        System.out.println("====================================");
        ll.printList();
        System.out.println("====================================");
        ll.addFirst(0);
        ll.printList();
        System.out.println("====================================");
        ll.addLast(2);
        ll.printList();
        System.out.println("====================================");
        ll.addLast(3);
        ll.printList();System.out.println("====================================");
        ll.removeLast();
        ll.printList();ll.printList();System.out.println("====================================");
        ll.removeFirst();
        ll.printList();


    }
}