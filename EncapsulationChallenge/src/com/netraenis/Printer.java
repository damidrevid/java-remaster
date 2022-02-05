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

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel += tonerLevel;
        if (tonerLevel < 0 && tonerLevel > 100) {
            System.out.println("Toner not filled");
        } else {

        }
        this.tonerLevel = tonerLevel;
    }
}
