package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
    /**
     * Given a range  array of size n where array contains elements
     * between 1 to n-1 with one element repeating, find the duplicate
     * in it.
     *
     * @param values
     */

    public static void findDuplicateElement(int[] values) {

        for (int i = 0; i < values.length; i++) {

            for (int j = i + 1; j < values.length; j++) {

                if (values[j] == values[i]) {

                    System.out.println("The duplicate value is " + values[j]);


                }
            }

        }

    }

}

