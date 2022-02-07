package com.netraenis;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;


    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
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
        if ((this.tonerLevel < 0) || (this.tonerLevel > 100)) {
            System.out.println("Toner not filled");
        } else {
            System.out.println("Your toner is filled and tonerLevel is currently at " + this.tonerLevel);
        }

    }

    public void printPage(int numberOfPages) {
        pagesPrinted += numberOfPages;
        tonerLevel -= (numberOfPages / 2);
        if (numberOfPages % 2 == 0) {
            isDuplex = true;
            System.out.println("Duplex printer was used.");
        }
        else {
            System.out.println("Single printer was used.");
        }


    }
}
