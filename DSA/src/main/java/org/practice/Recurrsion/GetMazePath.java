package org.practice.Recurrsion;

import java.util.ArrayList;

 /*ArrayList<String> myPaths =GetMazePath.getMazePath(1,1,3,3);
        System.out.println(myPaths);*/

public class GetMazePath {

    // source row and source column are 1,1 and we need to take the maze to the end corner i.2 dest row and dest column
    // Here it can move only 1 step at a time

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if ((sc == dc) && (sr == dr)) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> HPaths = new ArrayList<>();
        ArrayList<String> VPaths = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        if (sc < dc) {
            HPaths = getMazePath(sr, sc + 1, dr, dc);
            for (String hPath : HPaths) {
                res.add("h" + hPath);
            }
        }
        if (sr < dr) {
            VPaths = getMazePath(sr + 1, sc, dr, dc);
            for (String vPath : VPaths) {
                res.add("v" + vPath);
            }
        }
        return res;
    }
}
