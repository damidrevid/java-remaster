package com.netraenis;

import java.time.chrono.MinguoEra;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter number:");
            boolean itsAnInt = myScanner.hasNextInt();

            if (itsAnInt) {
                int number = myScanner.nextInt();

                if(number > max){
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            }else {
                break;
            }
            myScanner.nextLine();
        }
        myScanner.close();
        System.out.println("The Min value entered is : " + min + " and the Max is : " + max);
    }
}
