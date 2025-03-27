package org.practice.Recurrsion;

public class PrintDecreasingIncreasing {

    public static void pdi(int n){
        if (n == 0) {
        return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
