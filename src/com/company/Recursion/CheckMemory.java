package com.company.Recursion;

public class CheckMemory {

    public static int print(int n) throws IllegalArgumentException{

        if (n == 0) {

            return 1;

        } else {

            System.out.println(n);

            return print(n - 1);
        }
    }

    public static void main(String[] args) {

        int k  = CheckMemory.print(5);

        System.out.println(k);
    }
}
