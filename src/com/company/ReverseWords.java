package com.company;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWords {

    public static void main(String[] args){

        String word = "My name is Peter Gichia and i am a developer";

        Stack stack = new Stack(); //LIFO - Last In Last Out

        StringTokenizer tokenizer = new StringTokenizer(word); //Separates a string into tokens

        while(tokenizer.hasMoreTokens()){ //returns boolean value if there are more tokens
            stack.push(tokenizer.nextElement()); //performs an instruction to the next token/element and in this case it
                                                 //pushes into the stack

        }

        StringBuilder builder = new StringBuilder(); //Forming a new string using StringBuilder or preferably StringBuffer
        while(!stack.isEmpty()){ //Checks if stack is empty by returning a boolean value
            builder.append(stack.pop()); //builds a string by appending the strings from the last one to the first string entries
            builder.append(" ");//adds a space after every pop
        }

        System.out.println(builder); //prints the newly reversed string
    }
}
