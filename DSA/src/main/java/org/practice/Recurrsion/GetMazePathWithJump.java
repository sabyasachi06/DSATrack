package org.practice.Recurrsion;

import java.util.ArrayList;

/*ArrayList<String> myPaths =GetMazePathWithJump.getMazePathWithJump(1,1,3,3);
        System.out.println(myPaths);*/

public class GetMazePathWithJump {

    // source row and source column are 1,1 and we need to take the maze to the end corner i.2 dest row and dest column
    // Here it can move/jump multiple steps at a time, also it can move diagonally

    public static ArrayList<String> getMazePathWithJump(int sr, int sc, int dr, int dc) {
        ArrayList<String> HPaths = new ArrayList<>();
        ArrayList<String> VPaths = new ArrayList<>();
        ArrayList<String> DPaths = new ArrayList<>();
        ArrayList<String> ResPaths = new ArrayList<>();
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        // For horizontal move
        for (int ms = 1; ms <= dc - sc; ms++) {
            HPaths = getMazePathWithJump(sr, sc + ms, dr, dc);
            for (String hPaths : HPaths) {
                ResPaths.add("h" + ms + hPaths);
            }
        }
        // For vertical move
        for (int ms = 1; ms <= dr - sr;ms++) {
            VPaths = getMazePathWithJump(sr + ms, sc, dr, dc);
            for (String vPaths : VPaths) {
                ResPaths.add("v" + ms + vPaths);
            }
        }
        // For diagonal move
        for (int ms =1; ms <= dc - sc && ms < dr - sr; ms++) {
            DPaths = getMazePathWithJump(sr + ms, sc + ms, dr, dc);
            for (String dPaths : DPaths) {
                ResPaths.add("d" + ms + dPaths);
            }
        }
        return ResPaths;
    }
}