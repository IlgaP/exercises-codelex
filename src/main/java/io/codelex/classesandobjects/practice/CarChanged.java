package io.codelex.classesandobjects.practice;

public class CarChanged {

    double startKilometers;
    double liters;
    double currentKilometers;


    public CarChanged(double startOdo, double liters) {
        this.startKilometers = startOdo;
        this.liters = liters;

    }
    public double calculateConsumption(){

        return currentKilometers/liters;
    }
    public boolean gasHog(){

        return (calculateConsumption()<5.0);
    }
    public boolean economyCar(){
        return (calculateConsumption()>15.0);
    }
    public void fillUp(int mileage, double liters){
        currentKilometers = mileage - startKilometers;
        startKilometers = mileage;
        this.liters = liters;

    }
}
