package com.netraenis;

public class Honda extends Car{
    private int maintenanceDue;

    public Honda( int maintenanceDue) {
        super("Honda", "Sedan", 4, 5, 5, true, 1);
        this.maintenanceDue = maintenanceDue;
    }

    public void accelerate(int rate) {
        int newVelocity = getVelocity() + rate;
        if (newVelocity == 0) {
            stopVehicle();
            System.out.println("Car is in 'Park' state");
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            carMove(newVelocity, getTheDirection());
        }
    }
}
