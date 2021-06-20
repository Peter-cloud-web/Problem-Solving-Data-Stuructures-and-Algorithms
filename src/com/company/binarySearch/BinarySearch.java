package com.company.binarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearchIntegers(int[] list, int key,int hi,int low){

        Arrays.sort(list);

        int mid = (hi + low)/2;

        if(key > mid) return binarySearchIntegers(list,key,mid,hi);
        if(key < mid) return binarySearchIntegers(list,key,low,mid);
        return -1;
    }
}
