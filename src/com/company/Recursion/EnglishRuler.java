package com.company.Recursion;

public class EnglishRuler {

    public static void drawRuler(int nInches, int majorLength){

        drawLine(majorLength,0);

        for(int j = 1; j <= nInches; j++){

            drawInterval(majorLength - 1);

            drawLine(majorLength,j);
        }
    }

    private static void drawInterval(int centralLength){

        if(centralLength >= 1){

            drawInterval(centralLength - 1);

            drawLine(centralLength);

            drawInterval(centralLength - 1);
        }
    }

    private static void drawLine(int tickLength, int tickLabel){

        for(int j = 0; j < tickLength; j++){

            System.out.println("-");

            if(tickLabel > 0)

                System.out.println(" " + tickLabel);

            System.out.println("\n");
        }
    }

    private static void drawLine(int tickLength){

        drawLine(tickLength, -1);

    }

    public static void main(String[] args){

        EnglishRuler.drawRuler(5,10);
    }
}
