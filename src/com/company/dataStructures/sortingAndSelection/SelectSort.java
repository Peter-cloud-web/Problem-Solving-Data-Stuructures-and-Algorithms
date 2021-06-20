package com.company.dataStructures.sortingAndSelection;

public class SelectSort {

    public static void selectAndSort(int[] list, int lo, int hi) {

        for (int h = lo; h < hi; h++) {

            int s = getSmallest(list, h, hi);

            swap(list, h, s);
        }
    }

    public static int getSmallest(int[] list, int lo, int hi) {

        int small = lo;

        for (int h = lo + 1; h <= hi; h++) {

            if (list[h] < list[small]) small = h;
        }

        return small;
    }

    public static void swap(int[] list, int i, int j) {

        int hold = list[i];

        list[i] = list[j];

        list[j] = hold;
    }
}
