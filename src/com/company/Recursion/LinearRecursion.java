package com.company.Recursion;

public class LinearRecursion {

    public static int linearSum(int[] data, int n){
        if (n == 0) return  0;

        else {
            return linearSum(data , n - 1) + data[n - 1];
        }
    }

    public static void main(String[] args){
        int[] k = {8,9,7,6,9};
        int h = LinearRecursion.linearSum(k,5);
        System.out.println(h);
    }
}
