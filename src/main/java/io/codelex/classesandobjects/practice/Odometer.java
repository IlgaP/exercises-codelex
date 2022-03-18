package io.codelex.classesandobjects.practice;

public class Odometer {
    private static final double MAX_MILEAGE = 999.999;
    private final double startMileage;
    private final FuelGauge fuelGauge;
    private double mileage;


    public Odometer(double mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.startMileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public double currentMileage() {
        return mileage;
    }

    public void addMileage() {
        if (mileage < MAX_MILEAGE) {
            mileage++;
        } else {
            mileage = 0;
        }

        double distance = startMileage - mileage;
        if (distance % 10 == 0) {
            fuelGauge.burnFuel();
        }
    }


}
