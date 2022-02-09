package com.netraenis;

public class Car {
    private boolean hasEngine = true;
    private int cylinders;
    private int wheels = 4;
    private int gear = 6;
    private String name;

    //Constructor


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    // Getters
    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGear() {
        return gear;
    }

    public String getName() {
        return name;
    }

    // Methods
    public void startEngine() {
        System.out.println("Engine is now started, drive safely.");
    }

    public void accelerate() {
        System.out.println("Car in Accelerations. Warning: Speed kills");
    }

    public void brake() {
        System.out.println("Car brought to a stop. Thank God for brakes!");
    }



}
