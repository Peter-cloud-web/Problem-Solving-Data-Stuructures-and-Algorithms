package com.company.leetCode;

import java.util.Arrays;

public class BinarySearchRecursion {

    public static int binarySearch(int[] data, int target, int low, int high){

        Arrays.sort(data);

        int median = data.length;

        if(median % 2 != 0){
            Math.floor(median);

            if(data[median] < target){
                binarySearch(data,target,low,median - 1);
            }
            else{
                binarySearch(data,target,median - 1,high);
            }
        }
        return median;
    }
}
