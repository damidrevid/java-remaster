package com.netraenis;

public class AC {
    private String model;
    private int motherboard;
    private int theCase;
    private boolean status;

    public AC(String model, int motherboard, int theCase, boolean status) {
        this.model = model;
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.status = false;
    }

    public String getModel() {
        return model;
    }

    public int getMotherboard() {
        return motherboard;
    }

    public int getTheCase() {
        return theCase;
    }

    public boolean isStatus() {
        return status;
    }

    public void acSwitch(int a) {
        if (a == 0) {
            System.out.println("AC is Off");
        } else if (a == 1) {
            System.out.println("AC is On");
        } else {
            System.out.println("Invalid signal");
        }
    }
}
