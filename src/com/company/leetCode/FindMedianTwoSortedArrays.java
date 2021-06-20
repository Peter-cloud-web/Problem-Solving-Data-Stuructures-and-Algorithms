package com.company.leetCode;

import java.util.Arrays;

public class FindMedianTwoSortedArrays implements Median {

    /**
     * PROBLEM
     * Given two sorted arrays nums1 and nums2 of size m and n
     * respectively, return the median of the two sorted arrays
     */

    @Override
    public void FindMedianSortedArrays(int[] nums1, int[] nums2) {

//         Find the length of the array
        int num1Length = nums1.length;

        int num2Length = nums2.length;

//        Define an empty array with the max length size
        int[] result = new int[num1Length + num2Length];

//        Tells the program to copy nums1 from index 0 to result from index 0 to the last index
        System.arraycopy(nums1, 0, result, 0, num1Length);

        //        Tells the program to copy nums1 from index 0 to result from index 0 to the last index
        System.arraycopy(nums2, 0, result, num1Length, num2Length);

        Arrays.sort(result);

        System.out.println("Sorted Array :" + Arrays.toString(result));

        FindMedianValue(result);
    }

    @Override
    public void FindMedianValue(int[] result) {

        int resultMedian = result.length;

        int median;

        System.out.println("Length of array :" + resultMedian);

        if (resultMedian % 2 != 0) {

//            median = (int) Math.ceil(result[resultMedian / 2]);

            System.out.println("The median value is :" + result[resultMedian]);


        } else {

            int median1 = result[resultMedian/2];

            int median2 = result[(resultMedian/2) - 1];

            int realMedian = median1 + median2;

            System.out.println("The median value ish :" + Math.ceil(realMedian/2));
        }
    }

    public static void main(String[] args) {

        int[] test1 = {5,30,7,8,10,4,5,45,7};

        int[] test2 = {3,27,5,13,34,56,78,90};

        FindMedianTwoSortedArrays findMedianTwoSortedArrays = new FindMedianTwoSortedArrays();

        findMedianTwoSortedArrays.FindMedianSortedArrays(test1,test2);
    }
}
