package com.netraenis;

public class Main {

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(5, 11);

        calcFeetAndInchesToCentimeters(71);


//        calcFeetAndInchesToCentimeters(24);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >=0 && (inches >= 0 && inches <= 12) ) {
            //Feet to Centimeter
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;

            System.out.println(feet + "ft " + inches + "in equals " + centimeters + "cm");

            return centimeters;

        } else {
            System.out.println("Invalid number!");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {
            double inchToFeet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + inchToFeet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(inchToFeet, remainingInches);
        } else {
            System.out.println("Invalid number, again!!!");
            return -1;
        }
    }
}
