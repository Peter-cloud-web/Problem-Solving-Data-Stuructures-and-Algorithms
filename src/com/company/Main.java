package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // write your code here
        int[] X = {2,4,7,8,10};
        int[] Y = {1,3,9};

       //My Solution
        Merge.mergeArraysThenSplit(X,Y);
        Arrays.sort(X);
        Arrays.sort(Y);
        System.out.println("X :" + Arrays.toString(X));
        System.out.println("Y :" + Arrays.toString(Y));

        //Offered Solution
        Solution.mergeSoluton(X,Y);
        System.out.println("X :" + Arrays.toString(X));
        System.out.println("Y :" + Arrays.toString(Y));


    }
}
