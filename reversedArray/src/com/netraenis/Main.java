package com.netraenis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter total number of integers you'd like to work on");
        int count = scan.nextInt();
        scan.nextLine();

        int[] formedArray = readInteger(count);

        System.out.println("Array = " + Arrays.toString(formedArray));

        reverseArray(formedArray);

        System.out.println("Reversed array = " + Arrays.toString(formedArray));


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
//    public static int[] reversedArray(int[] array){
//
//        int[] myReversed = Arrays.copyOf(array, array.length);
//        int runIt = myReversed.length;
//
//        for(int a = 0; a < array.length;) {
//            int temp = myReversed[a];
//
//            for (int b = runIt-1; b>0;){
//                myReversed[b] = temp;
//                break;
//            }
////            runIt--;
//            a++;
//        }
//        return myReversed;
//    }

    public static void reverseArray(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = temp;
        }


    }

//    public static void printIt(int[] theArray){
//        for(int i = 0; i < theArray.length; i++) {
//            System.out.println(theArray[i]);
//        }
//    }

   }
