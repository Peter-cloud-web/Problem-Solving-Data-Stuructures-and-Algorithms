package com.company.bankDemo.inheritance;

public class TestProgression {

    public static void main(String[] args){

        /**
         * Here prog is polymorphic
         * It references objects of Arithmetic Progression and Geometric
         */
        Progression prog;
        prog = new ArithmeticProgression();
        prog = new GeometricProgression();

    }
}
