package com.company.leetCode;

public class PrimeNumbers {

    public void checkPrime(int num){
        int half = num/2;

        if(num <= 1){

            System.out.println("Not a prime number");

        }
        for(int i = 2; i <= num/2; num++){

            if(num % i == 0){

                System.out.println("Not a prime number");

                break;

            }else{

                System.out.println(" prime number");

                break;

            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.checkPrime(4);


    }
}
