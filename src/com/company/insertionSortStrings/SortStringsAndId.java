package com.company.insertionSortStrings;

import java.util.Arrays;

public class SortStringsAndId {

    public static void prallelSort(String[] list,int[] id){

        for(int i = 1; i < list.length; i ++){

            String curr_item = list[i];

            int curr_item_id = id[i];

            int prev_item_index = i - 1;

            while(prev_item_index >= 0 && curr_item.compareToIgnoreCase(list[prev_item_index]) < 0){

                list[prev_item_index + 1] = list[prev_item_index];

                id[prev_item_index + 1] = id[prev_item_index];

                --prev_item_index;
            }

            list[prev_item_index + 1] = curr_item;

            id[prev_item_index + 1] = curr_item_id;
        }

        System.out.println( "Sorted strings and id :\n " + "name :" + Arrays.toString(list) + "\nid :" + Arrays.toString(id) );
    }


}
