package io.codelex.classesandobjects.practice;


public class Exercise3Test {
    //private static final int MAX_FUEL = 70;

    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(10);
        System.out.println("Current fuel amount before filling up: " + fuelGauge.currentAmountOfFuel());

        Odometer odometer = new Odometer(0, fuelGauge);

        for (int i = fuelGauge.currentAmountOfFuel(); i < FuelGauge.MAX_FUEL; i++) {
            fuelGauge.addFuel();
        }

        System.out.println("Current fuel amount: " + fuelGauge.currentAmountOfFuel());

        while (fuelGauge.currentAmountOfFuel() > 0) {
            odometer.addMileage();

            System.out.println("Mileage: " + odometer.currentMileage());
            System.out.println("Fuel: " + fuelGauge.currentAmountOfFuel());
            System.out.println("-----------------------------");
        }


    }
}
