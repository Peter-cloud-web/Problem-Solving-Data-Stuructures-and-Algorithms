package com.company;

public class SubArrays {

    /**Given an array of integers
     * print all subarrays with 0 sum
     * @param values
     */
    public static void subArrayWithZeroSum(int[] values) {

        int sum;
        for (int i = 0; i < values.length; i++) {


            for (int j = i + 1; j < values.length; j++) {

                sum = values[j] + values[i];

                if (sum == 0) {
                    System.out.println("Subarrays that sums up to zero : "  + values[i]  + " and " + values[j]);
                }
                System.out.println("No subarray with zero sum");

            }

        }
    }
}
