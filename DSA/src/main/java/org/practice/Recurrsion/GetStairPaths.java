package org.practice.Recurrsion;

import java.util.ArrayList;

public class GetStairPaths {

    /*ArrayList<String> myPaths =GetStairPaths.getStairPath(4);
        System.out.println(myPaths);*/

  public static ArrayList<String> getStairPath(int n){
      if (n==0){
          ArrayList<String> bres = new ArrayList<>();
          bres.add("");
          return bres;
      }

      if(n<0){
          return new ArrayList<>();
      }

      ArrayList<String> paths1 = getStairPath(n-1);  //1   this will give n-1 paths
      ArrayList<String> paths2 = getStairPath(n-2);  //2   this will give n-2 paths
      ArrayList<String> paths3 = getStairPath(n-3);  //3   this will give n-3 paths

      ArrayList<String> finalPath = new ArrayList<String>();  //4

      for (String path:paths1){
          finalPath.add("1"+path);   // add 1 to n-1 paths
      }
      for (String path:paths2){    // add 2 to n-2 paths
          finalPath.add("2"+path);
      }
      for (String path:paths3){   // add 3 to n-3 paths
          finalPath.add("3"+path);
      }

      return finalPath;
  }
}
