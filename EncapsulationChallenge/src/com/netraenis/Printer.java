package com.netraenis;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;


    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Invalid Toner level");
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void refillToner(int tonerLevel) {
        this.tonerLevel += tonerLevel;
        if ((this.tonerLevel < 0) || (this.tonerLevel >  100)) {
            this.tonerLevel -= tonerLevel;
            System.out.println("Toner not filled");
        } else {
            System.out.println("Your toner is filled and tonerLevel is currently at " + this.tonerLevel);
        }

    }

    public void printPage(int numberOfPages) {
        if (numberOfPages > 0) {
            pagesPrinted += numberOfPages;
            tonerLevel -= (numberOfPages / 2);
            if (numberOfPages % 2 == 0) {
                isDuplex = true;
                System.out.println("Duplex print mode was used.");
            } else {
                System.out.println("Single print mode was used.");
            }

        // Printing Mode set by user
        int printMode = numberOfPages;
        if (isDuplex) {
            printMode = (printMode / 2) + (printMode % 2);
            System.out.println("To printing in Duplex mode #" + printMode + " sheets will be used.");
        }
        } else System.out.println("Nothing to print");


    }
}
