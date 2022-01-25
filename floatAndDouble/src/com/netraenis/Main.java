package com.netraenis;

public class Main {

    public static void main(String[] args) {

        int valueA= 5;
        float valueB = 5.25f;
        double valueC = 5.25f;

        int myPounds = 200;
        double convertionRate = 0.45359237;
        double poundToKg = convertionRate * myPounds;
        System.out.println("Your " + myPounds + " pounds is " + poundToKg + " in Kg.");

        char copyright = '\u00a9';
        System.out.println(copyright + "Damilare Drevid");


    }
}
