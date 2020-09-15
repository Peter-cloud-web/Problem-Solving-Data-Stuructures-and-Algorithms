package com.company;

public class ReverseString {

    public static void main(String[] args){
        String alphabet = "ABCDEFG";

        StringBuffer buffer = new StringBuffer(alphabet);
        String reversedString = buffer.reverse().toString();

        System.out.println(reversedString);
    }
}
