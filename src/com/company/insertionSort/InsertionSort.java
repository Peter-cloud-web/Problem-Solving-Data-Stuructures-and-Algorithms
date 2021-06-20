package com.company.insertionSort;

public class InsertionSort {

    public static int[] insertionSort(int[] list){

        for(int i = 1; i < list.length; i++){

            int curr_item = list[i];

            int prev_item_index = i - 1;

            while(prev_item_index >= 0 && curr_item < list[prev_item_index]){

                list[prev_item_index + 1] = list[prev_item_index];

                --prev_item_index;
            }

            list[prev_item_index + 1] = curr_item;


        }

        return list;
    }
}
