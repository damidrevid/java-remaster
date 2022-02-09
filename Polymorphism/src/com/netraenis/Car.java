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

// Sub-Classes
    public class Honda extends Car{
        public Honda(int cylinders, String name) {
            super(2, "Accord");
        }

        @Override
        public void startEngine() {
            System.out.println("Your Accord Engine is now powered and ready to be fired!");
        }

        @Override
        public void accelerate() {
            System.out.println("Warning from Honda; Speed kills!");
        }

        @Override
        public void brake() {
            super.brake();
        }
    }

    public class Toyota extends Car {
        public Toyota(int cylinders, String name) {
            super(1, "Lexus");
        }

        @Override
        public void accelerate() {
            System.out.println("Smooth!");
        }

        @Override
        public void brake() {
            System.out.println("Oh no, don't stop please!");
        }
    }

    public class Mercedes extends Car {
        public Mercedes(int cylinders, String name) {
            super(16, "GLS AMG");
        }

        public void startEngine(){
            System.out.println("Ready to fly?");
        }

        public void accelerate() {
            System.out.println("Zooom gently");
        }

        public void brake() {
            System.out.println("Later, we move!");
        }

    }


}
