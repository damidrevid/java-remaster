package com.netraenis;

public class Vehicle {
    private int wheel;
    private int brake;
    private int colour;

    public Vehicle() {
        this(4,1,4);
    }

    public Vehicle(int wheel, int brake, int colour) {
        this.wheel = wheel;
        this.brake = brake;
        this.colour = colour;
    }

    public int getWheel() {
        return wheel;
    }

    public int getBrake() {
        return brake;
    }

    public int getColour() {
        return colour;
    }

    public boolean gearChanged(int gear) {
        if (gear < 1) {
            System.out.println("Damaged Gear");
            return false;
        }
        else {
            System.out.println("Gear changed");
            return true;
        }
    }

    public void move(int direction) {
        System.out.println("You are now moving at " + gearChanged(direction) + "KmPH");
    }



}
