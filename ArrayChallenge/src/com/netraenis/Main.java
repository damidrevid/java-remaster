package com.netraenis;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getinputs(10);

        int[] sorted = sortArrayAsc(myIntegers);

        int[] re_sorted = sortArrayDesc(myIntegers);

        printArray(sorted);

        printArray(re_sorted);

	    }

    // Collect user input into as array
    public static int[] getinputs(int expectedNumOfInput) {
        int[] inputArray = new int[expectedNumOfInput];
        System.out.println("Enter a total of " + expectedNumOfInput + " integers \r");
        for (int a = 0; a < inputArray.length; a++){
            inputArray[a] = scanner.nextInt();
        }
        return inputArray;
    }

    //Print Array
    public static void printArray(int[] array) {
        for (int z = 0; z < array.length; z++){
            System.out.println("Position " + z + " holds " + array[z]);
        }
    }

    //Sort Array in Ascending Order
    public static int[] sortArrayAsc(int[] theArray) {
        int[] sortedArray = new int[theArray.length];
        //Copy the unsorted array into the new sorted array
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = theArray[i];
        }

        //Sort
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i=0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    //Sort Array in Descending Order
//    public static int[] sortArrayDesc(int[] theArray) {
//        int[] sortedArray = new int[theArray.length];
//        //Copy the unsorted array into the new sorted array
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = theArray[i];
//        }
//
//        //Sort
//        boolean condition = true;
//        int placeHolder;
//
//        while(condition) {
//            condition = false;
//            for (int a=0; a < sortedArray.length - 1; a++){
//                if(sortedArray[a] < sortedArray[a+1]) {
//                    placeHolder = sortedArray[a];
//                    sortedArray[a] = sortedArray[a+1];
//                    sortedArray[a+1] = placeHolder;
//                    condition = true;
//                }
//            }
//        }
//        return sortedArray;
    }



}
