package com.company;

public class Solution {

    public static void mergeSoluton(int[] X, int[] Y) {

        int m = X.length;
        int n = Y.length;

        for (int i = 0; i < m; i++) {
            if (X[i] > Y[0]) {

                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;

                int first = Y[0];

                int k;
                for (k = 1; k < n && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }
                Y[k - 1] = first;
            }
        }
    }
}
