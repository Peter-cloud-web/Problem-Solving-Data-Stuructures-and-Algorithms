package com.company.dataStructures.sortingAndSelection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAlg {

    public static void Sort(int[] elements) {

        List<Integer> sorted = new ArrayList<>();

        int n = elements.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int min = elements[i];

                if (elements[j] < min) {

                    elements[i] = elements[j];

                    elements[j] = min;

                } else {

                    elements[i] = min;

                    sorted.add(elements[i]);
                }

            }
        }

        System.out.println(Arrays.toString(elements));

    }

    public static void main(String[] args) {

        int[] e = {44,53,13,88,42,18,0,10,5,6,1,66,77,1009};

        SortingAlg.Sort(e);

    }
}
