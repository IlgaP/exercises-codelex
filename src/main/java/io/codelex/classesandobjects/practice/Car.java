package io.codelex.classesandobjects.practice;

public class Car {

    private static final double CONS_5 = 5.0;
    private static final double CONS_15 = 15.0;
    private final double startKilometers;
    private final double endKilometers;
    private final double liters;

    public Car(double startOdo, double ending0do, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = ending0do;
        this.liters = liters;
    }

    public double calculateConsumption() {

        return (endKilometers - startKilometers) / liters;
    }

    public boolean gasHog() {
        return (calculateConsumption() < CONS_5);
    }

    public boolean economyCar() {
        return (calculateConsumption() > CONS_15);
    }
}
