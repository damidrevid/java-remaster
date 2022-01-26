package com.netraenis;

public class Main {

    public static void main(String[] args) {
        int totalNum = 0; int count = 0;
        for (int n = 150; n <=1000; n++){
            if((n % 3  == 0) && (n % 5 == 0)){
                System.out.println("The luck number is " + n);
                totalNum += n;
                count++;

                if(count == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of the 5 contributing number is " + totalNum);
	// write your code here
    }
}
