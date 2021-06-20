package com.company.Recursion;

public class BinarySearch {

    public static boolean binaryMedianSearch(int[] data,int target,int high,int low){
        if(low > high) return false;

        else{
            int mid = (low + high)/2;

            if(target == data[mid])
                return true;
            else if(target < data[mid])
                return binaryMedianSearch(data,target,low,mid - 1);
            else{
                return binaryMedianSearch(data,target,mid + 1,high);
            }
        }
    }

    public static void main(String[] args){
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12};
       boolean k  =  BinarySearch.binaryMedianSearch(data,3,12,1);
        System.out.println(k);

    }
}
