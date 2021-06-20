package com.company.leetCode;

public class FactorialRecursion {

    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        System.out.println(FactorialRecursion.factorial(5));
    }
}
