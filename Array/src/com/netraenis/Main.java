package com.netraenis;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = i * 10;
        }
       printIt(intArray);
    }

    public static void printIt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Spot " + i + " has " + array[i]);
        }
    }
}
