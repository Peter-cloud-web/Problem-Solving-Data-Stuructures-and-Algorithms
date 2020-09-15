package com.company;

import java.io.IOException;
import java.io.StringReader;

public class ReadingStrings {
    public static  void readString() throws IOException {
        String string1 = "Culture";
        StringReader reader = new StringReader(string1);
        int singleChar = reader.read();
        System.out.println(singleChar);
    }

    public static void main(String[] args) throws IOException {
        ReadingStrings.readString();
    }
}
