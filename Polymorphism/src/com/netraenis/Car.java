package com.netraenis;

public class Car {
    private boolean hasEngine;
    private int cylinders;
    private int wheels;
    private int gear;
    private String name;

    //Constructor


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.hasEngine = true;
        this.wheels=4;
        this.gear=6;
    }

    // Getters
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // Methods
    public String startEngine() {
        return "Engine is now started, drive safely.";
    }

    public String accelerate() {
        return "Car in Accelerations. Warning: Speed kills";
    }

    public String brake() {
        return "Car brought to a stop. Thank God for brakes!";
    }

// Sub-Classes
    class Honda extends Car{
        public Honda() {
            super(2, "Accord");
        }

        @Override
        public String startEngine() {
            return "Your Accord Engine is now powered and ready to be fired!";
        }

        @Override
        public String accelerate() {
            return "Warning from Honda; Speed kills!";
        }

        @Override
        public String brake() {
            return super.brake();
        }
    }

    class Toyota extends Car {
        public Toyota() {
            super(1, "Lexus");
        }

        @Override
        public String accelerate() {
            return "Smooth!";
        }

        @Override
        public String brake() {
            return "Oh no, don't stop please!";
        }
    }

    static class Mercedes extends Car {
        public Mercedes() {
            super(16, "GLS AMG");
        }

        public String startEngine(){
            return "Ready to fly?";
        }

        public String accelerate() {
            return "Zooom gently";
        }

        public String brake() {
            return "Later, we move!";
        }

    }

    //Driver
    public class Main {

        public void main(String[] args) {
            for (int i = 1; i <10; i++) {
                Car car = randomCars();
            }
        }

        public Car randomCars() {
            int randomNumber = (int) (Math.random() * 3) + 1;
            System.out.println(randomNumber);

            switch (randomNumber) {
                case 1:
                    return new Honda();
                case 2:
                    return new Toyota();
                case 3:
                    return new Mercedes();
                default:
                    return null;
            }
        }
    }


}
