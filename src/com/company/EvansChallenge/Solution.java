package com.company.EvansChallenge;

import java.util.Arrays;

public class Solution {

    /**
     * @param A
     * @param n
     */

    public static void findSmallestMissingValue(int[] A, int n) {
//        Sort the array in ascending order
        Arrays.sort(A);
//        Remove duplicates from the array
        int[] cleanArray = removeDuplicateElements(A, n);

        int missingValue = 0;

//        Loop through the array
        for (int i = 0; i <= cleanArray.length - 1; i++) {

//            Assign the first element as the minimum element to a variable
            int minimumValue = cleanArray[i];

//            Assign the next element after the minimum element to a avariable
            int nextElement = cleanArray[i + 1];

//            Check for negative elements in the array and perform the following actions if any exists.
            if (minimumValue < 0) {

                if ((minimumValue - 1) != nextElement) {

                    missingValue = minimumValue + 1;

                    break;
                }

            }
//            perform this action on positive only elements
            if ((minimumValue + 1) != nextElement) {

                missingValue = minimumValue + 1;

                break;
            }
        }
        System.out.println(missingValue);
    }

    private static int[] removeDuplicateElements(int[] A, int n) {

        if (n == 0 || n == 1) {
            return A;
        }

        int[] newArray = new int[n];

        int j = 0;

        for (int i = 0; i < n - 1; i++) {

            if (A[i] != A[i + 1]) {
                newArray[j++] = A[i];
            }
        }

        newArray[j++] = A[n - 1];

        for (int i = 0; i < j; i++) {

            A[i] = newArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] A = {2, 2, 3, 3, 5, 5, 6, 6, 7, 7, 4, 5, 6, 7};
        int length = A.length;
        Solution.findSmallestMissingValue(A, length);

    }
}

