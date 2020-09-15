package com.company;

public class CompareToMethod {
    //CompareTo method returns an integer value
    // negative output means 2nd value comes b4 3rd value alphabetically
    //positive value means 1st value comes b4 2nd value alphabetically
    // 0 means the values are equal if the equals() method were used.

    public static void compareToMethodTestCase(){
        String name1 = "kohn";
        String name2 = "jamaa";

        int result = name1.compareTo(name2);
        System.out.println("Result is :" + result);

        if(result == 0){
            System.out.println("The names are equal");
        }else if(result > 0){
            System.out.println("name2 comes before name1 alphabetically");
        }else{
            System.out.println("name1 comes before name2 alphabetically");
        }

    }
}
