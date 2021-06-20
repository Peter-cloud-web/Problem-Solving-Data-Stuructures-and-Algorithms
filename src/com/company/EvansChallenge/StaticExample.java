package com.company.EvansChallenge;

import java.security.AlgorithmParameterGenerator;

public class StaticExample {

    String name;
    String occuptation;
    int age = 10;


    public static void main(String[] args){

        boolean flag = true;

        StaticExample staticExample1 = new StaticExample();
        StaticExample staticExample2 = new StaticExample();

        staticExample1.age = 10;

        if(staticExample1.age == staticExample2.age) {

            System.out.println("Equal");

        } else{

            System.out.println("Not equal");
        }



    }
}
