package com.netraenis;

 public class Car extends Vehicle {
     private int tyres;

     public Car() {
         super();
         this.tyres = 4;
     }

     public int getTyres() {
         return tyres;
     }

     @Override
     public boolean gearChanged(int gear) {
         System.out.println("This is a car");
         return super.gearChanged(gear);
     }

     @Override
     public void move(int direction) {
         System.out.println("Car on the moove!");
         super.move(direction);
     }
 }
