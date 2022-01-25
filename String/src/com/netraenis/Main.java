package com.netraenis;

public class Main {

    public static void main(String[] args) {

        String myNumber = "50";
        int newNumber = 50;
        myNumber = myNumber + newNumber;
        System.out.println(myNumber);

        int result = 4;
        result %= 3;
        System.out.println(result);

        // The Operator Challenge
        double valueA = 20.00;
        double valueB = 80.00;
        double bothNumbers = (valueA + valueB)*100;
        double remainder = bothNumbers % 40.00;

        boolean checkRemainder = (remainder == 0) ? true : false;
        System.out.println("The result of the operation thus far is; " + checkRemainder);

        if (!checkRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
