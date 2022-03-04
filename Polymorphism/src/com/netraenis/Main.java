package com.netraenis;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
            Car car = randomCar();
            System.out.println("Car lot #" + i + " : " + car.getName() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" + car.startEngine() );
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("The Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Car.Honda();
            case 2:
                return new Car.Toyota();
            case 3:
                return new Car.Mercedes();
            default:
                return null;
        }
    }


}
