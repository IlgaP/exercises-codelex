package io.codelex.classesandobjects.practice;

public class CarChanged {

    private static final double MAX_ECONOMY_CONSUMPTION = 5.0;
    private static final double MIN_ECONOMY_CONSUMPTION = 15.0;
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

        return (calculateConsumption() < MAX_ECONOMY_CONSUMPTION);
    }

    public boolean economyCar() {
        return (calculateConsumption() > MIN_ECONOMY_CONSUMPTION);
    }

    public void fillUp(int mileage, double liters) {
        currentKilometers = mileage - startKilometers;
        startKilometers = mileage;
        this.liters = liters;

    }
}
