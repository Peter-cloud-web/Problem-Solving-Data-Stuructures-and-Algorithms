package com.company.nullPointers;

import java.util.Locale;

public class NullPointer {

    public static void main(String[] args){

        String name = "Peter";

        if(name != null) {

            System.out.println(name.toUpperCase());

        }else{

            System.out.println(-1);

        }
    }
}
