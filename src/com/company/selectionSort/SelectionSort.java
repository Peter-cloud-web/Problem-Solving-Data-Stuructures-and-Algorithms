package com.company.selectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] list){
//        sort the list in ascending order from the list[lo] to list[hi]
        for (int i = 0; i < list.length; i++){

            for (int j = i + 1; j < list.length; j++){

                if( list[j] < list[i]){

                    swap(list,i,j);

                }
            }
        }

        return list;
    }
    
    public static void swap(int[] list, int i, int j){

        int temp = list[i];

        list[i] = list[j];

        list[j]= temp;

    }


}

//    public static int getSmallest(int[] list, int lo, int hi){
//        int small = lo;
//        for(int i = lo + 1; i <= hi; i++){
//            if(list[i] < list[small]) small = i;
//            return small;
//        }
//    }
//
//    public static void swap(int list[], int i, int j){
//         int hold = list[i];
//         list[i] = list[j];
//         list[j] = hold;
//    }
