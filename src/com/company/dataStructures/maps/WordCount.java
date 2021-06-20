package com.company.dataStructures.maps;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class WordCount {
//    A program that counts words in a document, printing the most frequent.

    public static void main(String[] args){

        Map<String,Integer> freq = (Map<String, Integer>) new HashMap<String,Integer>();

            Scanner doc  =  new Scanner(System.in).useDelimiter("[^a-zA-Z]+]");

            while(doc.hasNext()){

                String word = doc.next().toLowerCase();

                Integer count = freq.get(word);

                if(count == null)

                    count = 0;

                freq.put(word,1 + count);
            }

            int maxCount = 0;

            String maxWord = "no word";

            for(java.util.Map.Entry<String,Integer> ent:freq.entrySet())

                if(ent.getValue() > maxCount){

                    maxWord = ent.getKey();

                    maxCount = ent.getValue();
                }
    }
}
