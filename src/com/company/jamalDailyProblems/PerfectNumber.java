package com.company.jamalDailyProblems;

public class PerfectNumber {
    /**
     * Problem #52 [Hard]
     * This problem was asked by Microsoft.
     * <p>
     * A number is considered perfect if its digits sum up to exactly 10.
     * <p>
     * Given a positive integer n, return the n-th perfect number.
     * <p>
     * For example, given 1, you should return 19. Given 2, you should return 28.
     * <p>
     * <p>
     * <p>
     * MY PSEUDOCODE SOLUTION
     * <p>
     * Provide an array from 1 - 10
     * <p>
     * Declare a constant variable that stores the provided value
     * <p>
     * Loop through the array adding each value to the constant value
     * <p>
     * If the sum is 10 then join the two values to make up a perfect number
     */

    public static int perfectNumberProcessor(int n) {


        if (n == 0) {
            System.out.println(10);

        }else{

            for (int i = 0; i < 11; i++) {

                int k = i;

                if (k + n == 10) convertToString(k, n);

            }
        }
        return 0;
    }

    public static int convertToString(int k, int n) {
        String kToString = Integer.toString(k);
        String nToString = Integer.toString(n);
        String joinKN = kToString + nToString;

        int c = Integer.parseInt(joinKN);
        System.out.println(c);
        return c;

    }

    public static void main(String[] args) {
        PerfectNumber.perfectNumberProcessor(6);
    }
}
