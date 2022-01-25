package com.netraenis;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("The int Minimum Value is " + myMinIntValue);
        System.out.println("The int Maximum Value is " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("The byte Minimum Value is " + myMinByteValue);
        System.out.println("The byte Maximum Value is " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("The short minimum value is " + myMinShortValue);
        System.out.println("The short maximum value is " + myMaxShortValue);

        long myLongValue = 1093L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("The long minimum value is " + myMinLongValue);
        System.out.println("The long maximum value is " + myMaxLongValue);

        byte valueA = 109;
        short valueB = 16835;
        int valueC = 320583;
        long valueD = 50000L + 10L *(valueA + valueB + valueC);
        System.out.println("The total of the challenge is " + valueD);


    }
}
