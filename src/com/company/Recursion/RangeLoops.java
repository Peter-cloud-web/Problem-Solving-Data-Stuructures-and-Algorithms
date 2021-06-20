package com.company.Recursion;

public class RangeLoops {

    public static int range(int start, int end, int step) {
        int i = start;

        while (i <= end) {

            System.out.println(i);

            i = i + step;

            if(i > end) break;

        }

        return i;
    }

    public static void main(String[] args) {

        System.out.println(RangeLoops.range(0, 100000000, 4));
    }
}
