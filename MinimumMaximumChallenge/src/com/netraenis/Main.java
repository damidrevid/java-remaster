package com.netraenis;

import java.time.chrono.MinguoEra;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Finding Min, Max and Average of given numbers

        Scanner myScanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        double average = 0.0;
        int total = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter number:");
            boolean itsAnInt = myScanner.hasNextInt();

            if (itsAnInt) {
                int number = myScanner.nextInt();

                count++;
                total += number;

                average = total / count;

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
        System.out.println(count + " inputs received.");
        System.out.println("Average is "+average);
    }
}
