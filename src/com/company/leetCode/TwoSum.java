package com.company.leetCode;

import java.util.Arrays;

public class TwoSum {

    /**
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     *
     * SOLUTION PSEUDOCODE
     *
     * Use a nested loop
     * Check if the sum of two integers equals to the target
     * Get the index of the two values and insert them into an array
     * return the array
     */

    public static int[] twoSum(int[] nums, int target) {

        int[] sumIndices = new int[2];

        for(int i = 0; i < nums.length; i++){

            for (int j = 1; j < nums.length; j++){

                if(nums[i] + nums[j] == target){

                    sumIndices[0] = i;
                    sumIndices[1] = j;

                }
            }


        }

        return sumIndices;

    }

    public static void main(String[] args){
        int[] a = {3,5,6,8,4,1};

        int[] b = TwoSum.twoSum(a,4);

        System.out.println(Arrays.toString(b));
    }

}
