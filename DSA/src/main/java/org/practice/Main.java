package org.practice;


import org.practice.Recurrsion.*;
import org.practice.linkedList.MergeTwoSortedLL;
import org.practice.linkedList.SLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
/*
        int indexFirst = FirstIterationOfIndex.getFirstIndexOfIteration(new int[] {2,4,3,5,6,3,8},0,3);
        System.out.println("First occurrence index  -> "+indexFirst);
        System.out.println("===================================");

        int indexLast = FirstIterationOfIndex.getIndexOfIterationFromLast(new int[] {2,4,3,5,6,3,8},0,3);
        System.out.println("Last occurrence index  -> "+indexLast);*/
        /*MergeTwoSortedLL.mergeSorted(new SLinkedList(new int[] {1,2,3,4,5}),new SLinkedList(new int[] {7,8,9,10,12}));*/

        /*ArrayList<String> combinations = GetKeyPadCombination.getCombinations("123");
        System.out.println(combinations);*/

        /*ArrayList<String> myPaths =GetStairPaths.getStairPath(4);
        System.out.println(myPaths);*/

        /*ArrayList<String> myPaths =GetMazePath.getMazePath(1,1,3,3);
        System.out.println(myPaths);*/


        /*ArrayList<String> myPaths =GetMazePathWithJump.getMazePathWithJump(1,1,3,3);
        System.out.println(myPaths);*/

        int row = 3;
        int col = 4;
        int[][] arr = new int[row][col];
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }*/
        arr[0][0]=0; arr[0][1]=0; arr[0][2]=1; arr[0][3]=0;  // 0010
        arr[1][0]=0; arr[1][1]=0; arr[1][2]=1; arr[1][3]=0;  // 0010
        arr[2][0]=0; arr[2][1]=0; arr[2][2]=0; arr[2][3]=0;  // 0000

        boolean[][] marked = new boolean[row][col];

        FloodFillMaze.findPath(arr,0,0,"",marked);
    }
}