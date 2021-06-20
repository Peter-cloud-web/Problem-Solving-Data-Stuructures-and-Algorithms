package com.company.Recursion;

public class FactorialRecursionMethod {

    public static int factorial(int n) throws IllegalArgumentException{

        if (n < 0)
            throw new IllegalArgumentException( );
// argument must be nonnegative
        else if (n == 0)
            return 1;
// base case
        else

        return n * factorial(n  - 1);
    }

    public static void main(String[] args) {
       int k = FactorialRecursionMethod.factorial(5);
        System.out.println(k);
    }
}
