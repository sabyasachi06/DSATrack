package org.practice.Recurrsion;

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