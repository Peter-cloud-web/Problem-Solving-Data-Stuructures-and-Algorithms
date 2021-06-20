package com.company.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Example 2:
 * <p>
 * Input: nums = []
 * Output: []
 * Example 3:
 * <p>
 * Input: nums = [0]
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 *
 *
 * SOLUTION
 *
 * Approach 1: Scan from left to right
 * Intuition
 *
 * The problem looks simple at first glance. However, there are a few edge conditions that we must handle.
 * The basic idea is to scan the string from left to right and build the result for numerical characters.
 * In this process, we must carefully handle the integer overflow and underflow conditions.
 *
 * Algorithm
 *
 * We have to build numerical value by repeatedly shifting the result to left by one digit and adding the next number at the unit place.
 * Since numerical value is a decimal number represented as base 10 in the number system, each digit can be expressed as multiples of powers of 10.
 *
 * Example - "142" can be represented as 1 * (10^2) + 4 * (10^1) + 2 * (10^0)1∗(10
 * 2
 *  )+4∗(10
 * 1
 *  )+2∗(10
 * 0
 *  )
 *
 * 1 is at the hundredth place and left-shifted twice, 4 at tens place and shifted once, and so on.
 *
 * img
 *
 * This can be formulated as :
 *
 *  result * 10 + (str[i] - '0')
 * However, this could lead to integer overflow or underflow conditions. Since integer must be within the 32-bit signed integer range.
 *
 * Handling overflow and underflow conditions
 *
 * If the integer is positive, for 32 bit signed integer, \text{INT\_MAX}INT_MAX is 2147483647 (2^{31}-1)2147483647(2
 * 31
 *  −1) To avoid integer overflow, we must ensure that it doesn't exceed this value. This condition needs to be handled when the result is greater than or equal to \frac{\text{INT\_MAX}}{10}
 * 10
 * INT_MAX
 * ​
 *   (214748364)
 *
 * Case 1). If \text{result} = \frac{\text{INT\_MAX}}{10}result=
 * 10
 * INT_MAX
 * ​
 *  , it would result in integer overflow if next integer character is greater than 7. (7 in this case is last digit of \text{INT\_MAX} (2147483647)INT_MAX(2147483647)). We can use \text{INT\_MAX} \% 10INT_MAX%10 to generically represent the last digit.
 *
 * Case 2). If \text{result} > \frac{\text{INT\_MAX}}{10}result>
 * 10
 * INT_MAX
 * ​
 *  , we are sure that adding next number would result in integer overflow.
 *
 * This holds for negative integer as well. In the 32-bit integer, \text{INT\_MIN}INT_MIN value is -2147483648 (-2^{31})−2147483648(−2
 * 31
 *  ). As the last digit is greater than 7 (\text{INT\_MAX} \% 10INT_MAX%10), integer underflow can also be handled using the above approach.
 *
 * We must return \text{INT\_MAX}INT_MAX in case of integer overflow and \text{INT\_MIN}INT_MIN in case of integer underflow.
 *
 * Also, it must be noted that in some languages like Python, an integer value is not restricted by the number of bits. Handling of overflow and underflow won't be required in such cases. We could simply check if the value of an integer is out of specified range [{−2}^{31}−2
 * 31
 *  , {2}^{31} − 12
 * 31
 *  −1]
 *
 * Steps
 *
 * The algorithm can be summarised as follows
 *
 * Discard all the whitespaces at the beginning of the string.
 * There could be an optional sign of a numerical value +/-+/−. It should be noted that the integer is positive by default if there is no sign present and there could be at most one sign character.
 * Build the result using the above algorithm until there exists a non-whitespace character that is a number (00 to 99). Simultaneously, check for overflow/underflow conditions at each step.
 * Note: If there exists any non-integer character at step 3, we return 0 by default since it is not a valid integer. Also, we have to just discard all the characters after the first numerical value.
 *
 * class Solution {
 *     public int myAtoi(String str) {
 *         int i = 0;
 *         int sign = 1;
 *         int result = 0;
 *         if (str.length() == 0) return 0;
 *
 *         //Discard whitespaces in the beginning
 *         while (i < str.length() && str.charAt(i) == ' ')
 *             i++;
 *
 *         // Check if optional sign if it exists
 *         if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
 *             sign = (str.charAt(i++) == '-') ? -1 : 1;
 *
 *         // Build the result and check for overflow/underflow condition
 *         while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
 *             if (result > Integer.MAX_VALUE / 10 ||
 *                     (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
 *                 return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
 *             }
 *             result = result * 10 + (str.charAt(i++) - '0');
 *         }
 *         return result * sign;
 *
 *     }
 * }
 *
 */

public class TripletsSum {

//    INCOMPLETE

    public static List<List<Integer>> threeSum(int[] nums) {

        int numsLength = nums.length;

        List<List<Integer>> threeSumList = new ArrayList<>();

        if (numsLength == 0 || numsLength == 1 && nums[0] == 0) {

            return threeSumList;
        }

        List<Integer> uniqueTriplets = new ArrayList<>();

        int sumOfElements = 0;

        for (int i = 1; i < numsLength; i++) {

            for (int j = 2; j < numsLength; j++) {

                for (int k = 0; k < numsLength; k++) {

                    int sumOfElementsIndex = 0;

                    sumOfElements = nums[j] + nums[i] + nums[k];

                    if (sumOfElements == 0) {

                        uniqueTriplets.add(nums[j]);

                        uniqueTriplets.add(nums[i]);

                        uniqueTriplets.add(nums[k]);

                    }
                }
            }
        }

        threeSumList.add(uniqueTriplets);

        return threeSumList;
    }

    public static void main(String[] args) {

        int[] list = {-12, -2, 1, 2, -13, -4, 6, 4};

        List<List<Integer>> returnedList = TripletsSum.threeSum(list);

        System.out.println(returnedList);
    }
}

