package com.netraenis;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myIntegers = getIntegers(10);
        for (int a=0; a<myIntegers.length; a++){
            System.out.println("Position " + a + " holds " + myIntegers[a]);
        }

        System.out.println("Average of the numbers entered is " + calcAve(myIntegers));



    }

    public static int[] getIntegers (int number) {
        //Prompt users for input
        System.out.println("Please enter " + number + " numbers of your choice.\r");
        int[] value = new int[number];

        for (int i=0; i < value.length; i++) {
            int enteredNumber = scanner.nextInt();
            value[i] = enteredNumber;
        }
        return value;
    }

    public static double calcAve(int[] array) {
        int sum = 0;

        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        double averageNumber = (double) sum / (double) array.length;

        return averageNumber;
    }

}
