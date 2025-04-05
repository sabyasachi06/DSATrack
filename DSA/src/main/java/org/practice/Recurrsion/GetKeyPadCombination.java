package org.practice.Recurrsion;


import java.util.ArrayList;

public class GetKeyPadCombination {
                                              // 0  ,  1  ,  2  ,  3  ,  4  ,  5  ,   6   , 7  ,  8 ,   9
    static String[] globalCodes = new String[]{"?,","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".;"};

   public static ArrayList< String> getCombinations(String keyPad){
       //123
       if (keyPad.length() == 0){
       ArrayList<String> bres = new ArrayList<String>();
       bres.add("");
       return bres;
       }
       char ch = keyPad.charAt(0);// 1 is separated out
       String ros = keyPad.substring(1); //Separate the rest of string 23

       ArrayList<String> resList = getCombinations(ros);  // 1st
       ArrayList<String> myResList = new ArrayList<String>();

       String codesForCh = globalCodes[ch-'0']; // 2nd  // This will give me global code value from that ch (1), here it is abc

       for(int i =0;i<codesForCh.length();i++){               // 3
           char chOfCode =codesForCh.charAt(i);
           for(String str:resList){
               myResList.add(chOfCode+str);
           }
       }
       return myResList;
   }
}
