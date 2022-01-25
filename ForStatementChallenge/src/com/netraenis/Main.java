package com.netraenis;

public class Main {

    public static void main(String[] args) {

        for(double i=2; i<=8;) {
            double amount = 10000;
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(amount, i)));
            i++;
        }
        System.out.println("************************************* ");

        for(double i=8; i>=2;) {
            double amount = 10000;
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(amount, i)));
            i--;
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        double rate = amount * (interestRate/100);
        return rate;
    }



}
