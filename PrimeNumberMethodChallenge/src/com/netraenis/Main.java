package com.netraenis;

public class Main {

    public static void main(String[] args) {
        int primeTotal = 0;
        for(int n = 5; n < 50; n++) {
//            boolean isValid = isPrime(n);
            if(isPrime(n)) {
                System.out.println(n);
                primeTotal ++;

                if(primeTotal == 10) {
                    System.out.println("We now have a total of " + primeTotal + " Prime numbers");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i=2; i < n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
