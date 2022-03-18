package io.codelex.classesandobjects.practice;

public class CarChanged {

    private static final double CONS_5 = 5.0;
    private static final double CONS_15 = 15.0;
    private double startKilometers;
    private double liters;
    private double currentKilometers;


    public CarChanged(double startOdo, double liters) {
        this.startKilometers = startOdo;
        this.liters = liters;

    }

    public double calculateConsumption() {

        return currentKilometers / liters;
    }

    public boolean gasHog() {

        return (calculateConsumption() < CONS_5);
    }

    public boolean economyCar() {
        return (calculateConsumption() > CONS_15);
    }

    public void fillUp(int mileage, double liters) {
        currentKilometers = mileage - startKilometers;
        startKilometers = mileage;
        this.liters = liters;

    }
}
