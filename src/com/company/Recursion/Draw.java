package com.company.Recursion;

public class Draw {

    public static void treeUsingRecursion(int loopingTime){

              for(int i = loopingTime; i >= 0; i--){

                  System.out.print("o");

              }
              treeUsingRecursion(loopingTime - 1);

    }

    public static void main(String[] args){
        Draw.treeUsingRecursion(5);
    }
}
