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
}