package org.practice.Recurrsion;

public class PrintEncodings {

    // print the encodings for any given integer
    // provided a=1,b=2,c=3 ... z=26

    public static void printEncodings(String input, String encodings) {

        if (input.length() == 0) {
            System.out.println(encodings);
            return;
        }
        // "123"
        //for single digit
        char ch1 = input.charAt(0);                  // 1
        String roq = input.substring(1);   // 2
        int chv = ch1 - '0';                         // 3
        char code = (char) ('a' + chv - 1);              // 4
        if (chv == 0) {                                  // 5
            return;
        }
        if (chv > 0 && chv<=9) {                         // 6
            printEncodings(roq,encodings+code); // 7
        }
        if (input.length()>=2 ) {
            //for first 2 digits
            String ch2 = input.substring(0, 2);
            String roq2 = input.substring(2);

            int chv2 = Integer.parseInt(ch2);
            if (chv2<= 26) {
                char code2 = (char) ('a' + chv2 - 1);
                printEncodings(roq2, encodings+code2);
            }
        }

    }
}
