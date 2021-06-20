package com.company;

import com.company.binarySearch.BinarySearch;
import com.company.insertionSort.InsertionSort;
import com.company.insertionSortStrings.SortStrings;
import com.company.insertionSortStrings.SortStringsAndId;
import com.company.selectionSort.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] list = {4,6,3,8,2,5,9,6,77,66,74,34,56,32,34,5678905,23453,4,1,67890,12345,67,43,445,223};

        String[] stringList = {"peter", "Lenny" , "Henry" , "Job" , "Kayla" , "tommy","John" , "Ghost" , "Zootopia" , "Abijan"};

        int[] id = {4567,7865,76454,3456,7890,4321,3456,7865,4566,7864};



        int[] selection_sort = SelectionSort.selectionSort(list);

        int[] insertion_sort = InsertionSort.insertionSort(list);

        String[] insertion_sort_strings = SortStrings.insertionSortString(stringList);

        SortStringsAndId.prallelSort(stringList,id);

        int key = BinarySearch.binarySearchIntegers(list,5,0,list.length - 1);



        System.out.println("Selection sort : " + Arrays.toString(selection_sort));

        System.out.println("Insertion sort : " + Arrays.toString(insertion_sort));

        System.out.println("Insertion sort strings : "  + Arrays.toString(insertion_sort_strings));

        System.out.println(key);


    }
}
