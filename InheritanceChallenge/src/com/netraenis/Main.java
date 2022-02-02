package com.netraenis;

public class Main {

    public static void main(String[] args) {
        Honda honda = new Honda(15);

        honda.steer(45);
        honda.accelerate(0);
//        honda.accelerate(20);
        honda.accelerate(-40);
    }
}
