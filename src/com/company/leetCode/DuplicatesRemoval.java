package com.company.leetCode;

import java.util.Arrays;

public class DuplicatesRemoval {

    /**
     *
     Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

     Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

     Clarification:

     Confused why the returned value is an integer but your answer is an array?

     Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

     Internally you can think of this:

     // nums is passed in by reference. (i.e., without making a copy)
     int len = removeDuplicates(nums);

     // any modification to nums in your function would be known by the caller.
     // using the length returned by your function, it prints the first len elements.
     for (int i = 0; i < len; i++) {
     print(nums[i]);
     }
     Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

     Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

     Clarification:

     Confused why the returned value is an integer but your answer is an array?

     Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

     Internally you can think of this:

     // nums is passed in by reference. (i.e., without making a copy)
     int len = removeDuplicates(nums);

     // any modification to nums in your function would be known by the caller.
     // using the length returned by your function, it prints the first len elements.
     for (int i = 0; i < len; i++) {
     print(nums[i]);
     }
     * @param sortedArray
     * @return
     */

    public static int[] removeDuplicates(int[] sortedArray){

        int i = 0;

        for(int j = 1; j < sortedArray.length; j++){

            if(sortedArray[i] != sortedArray[j]){

                i++;

                sortedArray[i] = sortedArray[j];
            }
        }

        return sortedArray;
    }

    public static void main(String[] args){
        int[] r = {3,7,4,4,5,2,6,6,10,7,8,8};
        int[] c = removeDuplicates(r);
        System.out.println(Arrays.toString(c));
    }
}
