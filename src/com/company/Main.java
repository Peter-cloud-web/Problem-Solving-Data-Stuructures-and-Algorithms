package com.company;

public class Main {

    public static void main(String[] args) {

//        equals() is used for comparing references to objects
//        == used for comparing  contants of a string

        String name1 = new String("Johnny");
        String name2 = new String("Johnny");

        if(name1 .equals(name2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        String name3 = "Peter";
        String name4 = "Peter";

        if(name3 == name4){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        CompareToMethod.compareToMethodTestCase();

    }
}
