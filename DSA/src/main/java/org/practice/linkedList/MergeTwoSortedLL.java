package org.practice.linkedList;

public class MergeTwoSortedLL {

    public static void mergeSorted(SLinkedList l1, SLinkedList l2){

        SLinkedList.Node p1 = l1.head;
        SLinkedList.Node p2 = l2.head;

        SLinkedList mergedLl = new SLinkedList();
// {1,2,3,4,5} {7,8,9,10,12}
        while((p1 != null) && (p2 !=null)){
            if(p1.val > p2.val){
                mergedLl.addFirst(p1.val);
                p1 = p1.next;
            }else {
                mergedLl.addFirst(p2.val);
                p2 = p2.next;
            }
        }
        while (p1 != null){
            mergedLl.addFirst(p1.val);
            p1 = p1.next;
        }
        while (p2 != null){
            mergedLl.addFirst(p2.val);
            p2 = p2.next;
        }
        printList(mergedLl);
    }

    private static void printList(SLinkedList ll){
        SLinkedList.Node tmp = ll.head;

        while(tmp.next!=null){
            System.out.print(tmp.val + " -> ");
            tmp = tmp.next;
        }
        System.out.print( "null");
    }
}
