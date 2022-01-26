package com.netraenis;

public class Main {

    public static void main(String[] args) {
        isEven(1000);

        int number = 4;
        int lastNumber = 20;
        int totalEvenNumber = 0;
        int totalOfEvenFound = 0;

        while (number <= lastNumber) {
            number++;
            if(!isEven(number)){
                continue;
            }
            System.out.println("This is an Even number --> " + number);
            totalOfEvenFound += number;
            totalEvenNumber++;

            if (totalEvenNumber == 5) {
                break;
            }
        }System.out.println("A total of "+ totalEvenNumber + " even numbers" +
                " were found." + "The Sum of the "+ totalEvenNumber + " even number above is " + totalOfEvenFound);

    }

    private static boolean isEven(int n){
        if(n%2==0){
//            System.out.println(n + " is an Even number");
            return true;
        }
        else
//            System.out.println(n + " is not an Even number");
            return false;
    }
}
