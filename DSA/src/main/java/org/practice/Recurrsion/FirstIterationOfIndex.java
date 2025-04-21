package org.practice.Recurrsion;
/*int indexFirst = FirstIterationOfIndex.getFirstIndexOfIteration(new int[] {2,4,3,5,6,3,8},0,3);
        System.out.println("First occurrence index  -> "+indexFirst);*/

public class FirstIterationOfIndex {

    public static int getFirstIndexOfIteration(int[] arr, int idx, int x) {

        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            return getFirstIndexOfIteration(arr, idx + 1, x);
        }
    }

    public static int getIndexOfIterationFromLast(int[] arr, int idx, int x) {
        if (idx == arr.length ) {
            return -1;
        }

        int fifl = getIndexOfIterationFromLast(arr, idx + 1, x);
        if (fifl ==-1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return fifl;
            }
        }
        return fifl;
    }


}