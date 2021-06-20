package com.company.leetCode;

public class HalfPyramid{

    public static void printHalfPyramid(int counter){

        while (counter != 0){

            System.out.print("*");

            counter--;

            printHalfPyramid(counter);

        }

        System.out.println();
    }

    public static void printHalfPyramidV2(int counter){

        for(int i = 1; i < counter; i++ ){

            for(int j = 1; j < i; j++){

                System.out.print("*");

                for(int k = 0; k < i; k++){

                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args){

        HalfPyramid hf = new HalfPyramid();

        hf.printHalfPyramidV2(6);
    }


}
