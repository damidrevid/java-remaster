package com.netraenis;

public class Main {

    public static void main(String[] args) {

        char alphab = 'D';

        switch(alphab) {
            case A:
                System.out.println("It's not A");
                break;
            case B:
                System.out.println("It's not B");
                break;
            case C:
                System.out.println("It's not C");
                break;
            case D:
                System.out.println("Yay!, It's a D");
                break;
            case E:
                System.out.println("It's not an E");
                break;
            default:
                System.out.println("You got it wrong");
                break;
        }
    }
}
