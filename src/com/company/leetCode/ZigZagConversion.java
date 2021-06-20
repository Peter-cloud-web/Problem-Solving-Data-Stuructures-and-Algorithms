package com.company.leetCode;

import java.util.Arrays;

/**
 * PROBLEM
 * The string "PAYPALISHIRING" is written in a zigzag pattern
 * on a given number of rows like this:
 *  (you may want to display this pattern in a
 *  fixed font for better legibility)
 *
 *  P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 */

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        int cycleLength = 2 * numRows - 2;

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < n; j+= cycleLength){
                stringBuilder.append(s.charAt(j+i));

                if(i != 0 && i != numRows - 1 && j + cycleLength - i < n)
                    stringBuilder.append(s.charAt(j + cycleLength - i));
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int numRows = 1;
        System.out.println(ZigZagConversion.convert(s,numRows));
    }
}
