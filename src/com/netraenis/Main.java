package com.netraenis;

public class Main {

    public static void main(String[] args) {

        char alphab = 'D';

        switch(alphab) {
            case 'A': case 'B': case 'C':
                System.out.println("It's neither A, B or C");
                break;
            case 'D':
                System.out.println("Yay!, It's a D");
                break;
            case 'E':
                System.out.println("It's not an E");
                break;
            default:
                System.out.println("You got it wrong");
                break;
        }

    }
}
