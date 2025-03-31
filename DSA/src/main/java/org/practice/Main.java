package org.practice;


import org.practice.Recurrsion.Factorial;
import org.practice.Recurrsion.FirstIterationOfIndex;
import org.practice.Recurrsion.PrintDecreasingIncreasing;
import org.practice.Recurrsion.TowerOfHanoi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Linked list calls
        /*DLinkedList ll = new DLinkedList(1);
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
        ll.printList();*/

        // Recursion calls
        // PrintDecreasingIncreasing.pdi(5);
//        System.out.println(Factorial.fact(5));
// ========================================================= Recursion =============
//        TowerOfHanoi.toh(5,10,12,11);

        int index = FirstIterationOfIndex.getFirstIndexOfIteration(new int[] {2,4,3,5,6,3,8},0,8);
        System.out.println(index);
    }
}