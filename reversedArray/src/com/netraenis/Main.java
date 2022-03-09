package com.netraenis;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter total number of integers you'd like to work on");
        int count = scan.nextInt();
        scan.nextLine();


        int[] formedArray = readInteger(count);

        int[] finalReversed = reversedArray(formedArray);

        printIt(formedArray);
        printIt(finalReversed);


    }

    // Original Array
    public static int[] readInteger(int count){
        int[] enteredNumbers = new int[count];
        System.out.println("Please enter the " + count + " numbers \r");

        for (int a = 0; a < enteredNumbers.length; a++) {
            int number = scan.nextInt();
            scan.nextLine(); //Handling the enter key being pressed my users
            enteredNumbers[a] = number;
        }
        return enteredNumbers;
    }

    // Reserved array
    public static int[] reversedArray(int[] array){
        int value = 0;
        int[] myReversed = new int[array.length];
        int runIt = myReversed.length;

        for(int a = 0; a < array.length;) {
            value = array[a];

            for (int b = runIt-1; b>0;){
                myReversed[b] = value;

            }
            runIt--;
            a++;
        }
        return myReversed;
    }

    public static void printIt(int[] theArray){
        for(int i = 0; i < theArray.length; i++) {
            System.out.println(theArray[i]);
        }
    }

   }
