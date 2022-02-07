package com.netraenis;

public class Main {

    public static void main(String[] args) {
        Printer thePrinter = new Printer(90, 10, false);

        System.out.println("Number of pages printed " + thePrinter.getPagesPrinted());
        System.out.println("Toner level " + thePrinter.getTonerLevel());
        thePrinter.printPage(3);
        System.out.println("The number of printed pages is now " + thePrinter.getPagesPrinted());

        thePrinter.printPage(20);

        System.out.println("Toner level is " + thePrinter.getTonerLevel());
        thePrinter.refillToner(7);
        System.out.println("Toner level is " + thePrinter.getTonerLevel());
    }
}
