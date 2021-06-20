package com.company.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 * <p>
 * Input: digits = ""
 * Output: []
 * Example 3:
 * <p>
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 * <p>
 * <p>
 * Solution
 * Approach 1: Backtracking
 * Backtracking is an algorithm for finding all solutions by exploring all potential candidates.
 * If the solution candidate turns to be not a solution (or at least not the last one),
 * backtracking algorithm discards it by making some changes on the previous step, i.e. backtracks and then try again.
 * <p>
 * Here is a backtrack function backtrack(combination, next_digits) which takes as arguments an ongoing letter combination and the next digits to check.
 * <p>
 * If there is no more digits to check that means that the current combination is done.
 * If there are still digits to check :
 * Iterate over the letters mapping the next available digit.
 * Append the current letter to the current combination combination = combination + letter.
 * Proceed to check next digits : backtrack(combination + letter, next_digits[1:]).
 * Current
 * 1 / 14
 * <p>
 * class Solution {
 * Map<String, String> phone = new HashMap<String, String>() {{
 * put("2", "abc");
 * put("3", "def");
 * put("4", "ghi");
 * put("5", "jkl");
 * put("6", "mno");
 * put("7", "pqrs");
 * put("8", "tuv");
 * put("9", "wxyz");
 * }};
 * <p>
 * List<String> output = new ArrayList<String>();
 * <p>
 * public void backtrack(String combination, String next_digits) {
 * // if there is no more digits to check
 * if (next_digits.length() == 0) {
 * // the combination is done
 * output.add(combination);
 * }
 * // if there are still digits to check
 * else {
 * // iterate over all letters which map
 * // the next available digit
 * String digit = next_digits.substring(0, 1);
 * String letters = phone.get(digit);
 * for (int i = 0; i < letters.length(); i++) {
 * String letter = phone.get(digit).substring(i, i + 1);
 * // append the current letter to the combination
 * // and proceed to the next digits
 * backtrack(combination + letter, next_digits.substring(1));
 * }
 * }
 * }
 * <p>
 * public List<String> letterCombinations(String digits) {
 * if (digits.length() != 0)
 * backtrack("", digits);
 * return output;
 * }
 * }
 */

public class LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinations(String digits) {

        Map<String, String> phone = new HashMap<String, String>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};

        List<String> letters = new ArrayList<>();

        String digitOutcome = phone.get(digits);

        if (Integer.parseInt(digits) > 9 && Integer.parseInt(digits) != 10) {
            String fnumber = digits.substring(0, 1);
            String snumber = digits.substring(1);

            String m  = phone.get(fnumber);
            String n  =  phone.get(snumber);

            for(int i = 0; i < m.length(); i++){

                for(int j = 0; j < n.length();j++){

                    String ret = m.substring(0 + i , i+1) + n.substring(0 + j,j+1);
                     letters.add(ret);
                }
            }

        } else {

                letters.add(digitOutcome);
        }

        return letters;
    }

    public static void main(String[] args) {
        String digits = "87";
        List<String> l = LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        System.out.println(l);
    }

}


