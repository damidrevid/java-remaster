package com.netraenis;

 public class Car extends Vehicle {
     private int wheels;
     private int doors;
     private int gears;
     private boolean isAutomatic;

     private int currentGear;

     public Car(String name, String size, int wheels, int doors, int gears, boolean isAutomatic, int currentGear) {
         super(name, size);
         this.wheels = wheels;
         this.doors = doors;
         this.gears = gears;
         this.isAutomatic = isAutomatic;
         this.currentGear = 1;
     }

     public int getWheels() {
         return wheels;
     }

     public int getDoors() {
         return doors;
     }

     public int getGears() {
         return gears;
     }

     public boolean isAutomatic() {
         return isAutomatic;
     }

     public int getCurrentGear() {
         return currentGear;
     }

// The Methods
     public void changeGear(int currentGear) {
         this.currentGear = currentGear;
         System.out.println("Gear changed to " + this.currentGear);
     }

     public void carMove(int velocity, int direction) {
         move(velocity, direction);
         System.out.println("You car is moving faster with Velocity of " + velocity + " " +
                 "in " + direction + " degrees in direction");
     }

 }
