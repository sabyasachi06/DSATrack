package org.practice.Recurrsion;

public class TowerOfHanoi {

    /*
    n = is the number of disks given in source tower
    src = tower where all the disks are provided initially.
    dest = tower where we need to move all the disks.
    helper = one extra tower which can be used as the helper tower.

    Target is to print instructions for moving the disks from source to destination using the helper tower, we can move only one disk at a time and no large disk can be put above a smaller disk, We can take help of euler's path later to understand the flow of execution.˙

    * */
    public static void toh(int n, int src, int dest, int helper) {
        if (n == 0) {
            return;
        }
        // ======== pre section ============= //
        toh(n - 1, src, helper, dest); // This is left call, where we are assuming that all the disks till n-1 will be moved from source to helper using destination.
        System.out.println(n + "[" + src + " -> " + dest + "]");// IN section, 1[10 -> 11], Assuming all the other instructions are printed till n-1 is printed in the above line, so we aare printing the last instructions ourselves.
        toh(n - 1, helper, dest, src); // This is right call, Since I have moved the nth disk into the destination tower in the above step, therefore now I want all n-1 disks into the dest tower.
        // ======== post section ============= //

    }
}
