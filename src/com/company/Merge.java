package com.company;

import java.util.Arrays;

public class Merge {

    /**Given two sorted arrays X[] and Y[] of size m and n each, merge elements of X[] with elements
     * of array Y[] by maintaining the sorted order .i.e fill X[] with first m smallest elements and fill
     * Y[] with remaining element.
     * @param X
     * @param Y
     */

    public static void mergeArraysThenSplit(int[] X, int[] Y) {

        int m = X.length;
        int n = Y.length;

        for (int i = 0; i < m; i++) {

            int min = X[i];

            for (int j = 0; j < n; j++) {

                int current = X[i];

                if (Y[j] < min) {

                    X[i] = Y[j];

                    Y[j] = current;
                }
            }

        }


    }
}
