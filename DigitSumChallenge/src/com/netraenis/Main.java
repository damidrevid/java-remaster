package com.netraenis;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(6543));
    }
    private static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number >0) {
            // extract the least-significant digit
            int digit = number % 10; //The result of this operation will be the last digit of the given number.
            System.out.println(digit);
            sum += digit;  // We store the last digit gotten from the above operation in the variable "sum"

            // drop the least-significant digit
            number /= 10;  //To eliminate the last digit, we divide the given number with 10 and store the result in an int variable
                            // which chops off anything behind the whole number by default. The new number goes to the top and the process is repeated until we have the numbers individually.
        }

        return sum;
    }
}
