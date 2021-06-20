package com.company.Java8Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.toList;

public class Streams {

    void streaming(){
        List<String> collected = Stream.of("A" , "B","cULTURE")
                .collect(toList());
        System.out.println(collected);

        List<String> collected2 = new ArrayList<>();
        for(String string: Arrays.asList("a","b","pETER")){
            String uppercased = string.toUpperCase();
            collected.add(uppercased);
        }

        List<String> collected3 = Stream.of("hello","a")
                .map(x -> x.toUpperCase() )
                .collect(toList());
       }

       List<String> beginning = Stream.of("1abcd","abc1d","abcd2")
               .filter(value -> isDigit(value.charAt(0)))
               .collect(toList());

       List<Integer> together = (List<Integer>) Stream.of(Arrays.asList(1,3,4),Arrays.asList(4,6,7,8))
               .flatMap(numbers -> numbers.stream())
               .collect(toList());


}
