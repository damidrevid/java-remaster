package com.netraenis;

public class Vehicle {
    private String name;
    private String size;
    private int velocity;
    private int theDirection;
    private int speed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity = 0;
        this.theDirection = 0;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getTheDirection() {
        return theDirection;
    }

    public int getSpeed() {
        return speed;
    }

    // The methods
    public void steer (int direction) {
        this.theDirection += direction;
        System.out.println("Your Vehicle is heading the " + theDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.theDirection = direction;
        this.velocity += velocity;
//        this.speed = theDirection * this.velocity;
        System.out.println("This Vehicle is moving at " + velocity + " and in " + theDirection + " degrees direction" );
    }

    public void stopVehicle() {
        this.velocity = 0;
    }
}
