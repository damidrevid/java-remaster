package com.netraenis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int numberSum = 0;
        int count = 1;

        while(count <= 10) {
            System.out.println("Enter number #" + count + ": ");
            boolean hasNextInt = myScan.hasNextInt();

            if (hasNextInt) {
                int number = myScan.nextInt();
                numberSum += number;
                count++;
            }else {
                System.out.println("Invalid number, Try again");
            }
            myScan.nextLine();

        }
        System.out.println("Sum of the 10 numbers entered = " + numberSum);
        myScan.close();
    }
}
