package io.codelex.classesandobjects.practice;

public class Car {

    double startKilometers;
    double endKilometers;
    double liters;

    public Car(double startOdo, double ending0do, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = ending0do;
        this.liters = liters;
    }
    public double calculateConsumption(){

        return (endKilometers-startKilometers)/liters;
    }
    public boolean gasHog(){
        return (calculateConsumption()<5.0);
    }
    public boolean economyCar(){
        return (calculateConsumption()>15.0);
    }
}
