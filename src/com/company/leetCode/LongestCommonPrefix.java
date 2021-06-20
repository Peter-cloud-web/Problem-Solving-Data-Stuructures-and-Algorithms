package com.company.leetCode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 *
 * SOLUTION
 * Approach 1: Horizontal scanning
 * Intuition
 *
 * For a start we will describe a simple way of finding the longest prefix shared by a set of strings LCP(S_1 \ldots S_n)LCP(S
 * 1
 * ​
 *  …S
 * n
 * ​
 *  ). We will use the observation that :
 *
 * LCP(S_1 \ldots S_n) = LCP(LCP(LCP(S_1, S_2),S_3),\ldots S_n)LCP(S
 * 1
 * ​
 *  …S
 * n
 * ​
 *  )=LCP(LCP(LCP(S
 * 1
 * ​
 *  ,S
 * 2
 * ​
 *  ),S
 * 3
 * ​
 *  ),…S
 * n
 * ​
 *  )
 *
 * Algorithm
 *
 * To employ this idea, the algorithm iterates through the strings [S_1 \ldots S_n][S
 * 1
 * ​
 *  …S
 * n
 * ​
 *  ], finding at each iteration ii the longest common prefix of strings LCP(S_1 \ldots S_i)LCP(S
 * 1
 * ​
 *  …S
 * i
 * ​
 *  ) When LCP(S_1 \ldots S_i)LCP(S
 * 1
 * ​
 *  …S
 * i
 * ​
 *  ) is an empty string, the algorithm ends. Otherwise after nn iterations, the algorithm returns LCP(S_1 \ldots S_n)LCP(S
 * 1
 * ​
 *  …S
 * n
 * ​
 *  ).
 *
 * Finding the longest common prefix
 *
 * Figure 1. Finding the longest common prefix (Horizontal scanning)
 *
 *
 * Complexity Analysis
 *
 * Time complexity : O(S)O(S) , where S is the sum of all characters in all strings.
 *
 * In the worst case all nn strings are the same. The algorithm compares the string S1S1 with the other strings [S_2 \ldots S_n][S
 * 2
 * ​
 *  …S
 * n
 * ​
 *  ] There are SS character comparisons, where SS is the sum of all characters in the input array.
 *
 * Space complexity : O(1)O(1). We only used constant extra space.
 *
 *
 * Approach 2: Vertical scanning
 * Algorithm
 *
 * Imagine a very short string is at the end of the array.
 * The above approach will still do SS comparisons. One way to optimize this case is to do vertical scanning.
 * We compare characters from top to bottom on the same column (same character index of the strings) before moving on to the next column.
 *
 * public String longestCommonPrefix(String[] strs) {
 *     if (strs == null || strs.length == 0) return "";
 *     for (int i = 0; i < strs[0].length() ; i++){
 *         char c = strs[0].charAt(i);
 *         for (int j = 1; j < strs.length; j ++) {
 *             if (i == strs[j].length() || strs[j].charAt(i) != c)
 *                 return strs[0].substring(0, i);
 *         }
 *     }
 *     return strs[0];
 * }
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) throws ArrayIndexOutOfBoundsException {

        StringBuilder sb  =  new StringBuilder();

        for(int i = 0; i < strs.length; i++){

            char c = strs[0].charAt(i);

            for( int j = 1; j < strs.length; j++){

                if(strs[j].charAt(i) != c){

                    sb.append(strs[0].substring(0,i));
                }
            }
        }

        return sb.toString();

       }

    public static void main(String[] args){

        String[] strs = {"Flower", "Flow","Floj","Flore"};

        String lp = LongestCommonPrefix.longestCommonPrefix(strs);

        System.out.println(lp);
    }
}
