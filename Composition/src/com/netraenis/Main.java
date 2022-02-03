package com.netraenis;

public class Main {

    public static void main(String[] args) {
        Case theCase = new Case("2002", "HP", "240",new Dimensions(32,16, 8));

        Monitor theMonitor = new Monitor("2022", "HP", 32, new Resolution(1080, 720));

        Motherboard theMotherboard = new Motherboard("2022", "HP", 2, 1, "v2.22");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();
        thePC.draw();



    }
}
