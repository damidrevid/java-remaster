package com.netraenis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter total number of integers you'd like to work on");
        int count = scan.nextInt();
        scan.nextLine();


        int[] myIntegerArray = readInteger(count);

        int returnedMin = findMin(myIntegerArray);

        System.out.println("The minimum value in the array is " + returnedMin);
    }

    // Accepting input count as param and populating the Array with user input.
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

    //Find Minimum method
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] paramArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < paramArray.length; i++) {
            if(paramArray[i] < min) {
                min = paramArray[i];
            }else max = paramArray[i];
        }
        return min;
    }


}
