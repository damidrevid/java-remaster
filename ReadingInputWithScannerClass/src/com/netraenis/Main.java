package com.netraenis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input your year of birth:");

        boolean hasNextInt = myScanner.hasNextInt();

        if(hasNextInt) {
            int yOB = myScanner.nextInt();
            myScanner.nextLine();  //This is to handle next character (Enter Key) Issue.
            if(yOB <= 0){
                System.out.println("Invalid Year Of Birth");
            } else {

                System.out.println("Wht is your name?");
                String name = myScanner.nextLine();

                int age = 2022 - yOB;

                System.out.println("Hi " + name + ", you are " + age + "years old");
            }
        } else
        {
            System.out.println("Year of birth must be a number!");
        }
        myScanner.close();
    }
}
