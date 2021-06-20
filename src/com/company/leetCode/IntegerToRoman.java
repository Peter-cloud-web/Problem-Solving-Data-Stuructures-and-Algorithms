package com.company.leetCode;

import com.company.dataStructures.maps.Map;

import java.util.HashMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However,
 * the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 3
 * Output: "III"
 * Example 2:
 *
 * Input: num = 4
 * Output: "IV"
 * Example 3:
 *
 * Input: num = 9
 * Output: "IX"
 * Example 4:
 *
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 5:
 *
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= num <= 3999
 */

public class IntegerToRoman {

  public static void intToRoman(int num) {
//      Roman values  = I,II,III,IV,V,VI,VII,VIII,IX,X

      HashMap<Integer, String> romanValues = new HashMap<Integer, String>();

      romanValues.put(1, "I");
      romanValues.put(2, "II");
      romanValues.put(3, "III");
      romanValues.put(4, "IV");
      romanValues.put(5, "V");
      romanValues.put(6, "VI");
      romanValues.put(7, "VII");
      romanValues.put(8, "VIII");
      romanValues.put(9, "IX");
      romanValues.put(10, "X");

      if (num >= 10 && num < 20) {

          if (num == 10) System.out.println(romanValues.get(10));

          String numberToString = Integer.toString(num);

          String num2 = numberToString.substring(1);

          int num4 = Integer.parseInt(num2);

          System.out.println(romanValues.get(10) + romanValues.get(num4));

      } else {

          System.out.println("No roman value for the set number.Try again with a value from 10 to 19");
      }

  }

      public static void romanToInt(String roman) {
//      Roman values  = I,II,III,IV,V,VI,VII,VIII,IX,X

          HashMap<String,Integer> romanValues2 =  new HashMap<String,Integer>();

          romanValues2.put("I",1);
          romanValues2.put("II",2);
          romanValues2.put("III",3);
          romanValues2.put("IV",4);
          romanValues2.put("V",5);
          romanValues2.put("VI",6);
          romanValues2.put("VII",7);
          romanValues2.put("VIII",8);
          romanValues2.put("IX",9);
          romanValues2.put("X",10);


              if(roman == "X") System.out.println(romanValues2.get("X"));

//              System.out.println(romanValues2.get("X") + romanValues2.get(num2));

          }

    public static void main(String[] args){

      IntegerToRoman.intToRoman(19);

   }

}
