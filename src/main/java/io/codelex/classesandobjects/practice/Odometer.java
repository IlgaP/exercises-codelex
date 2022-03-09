package io.codelex.classesandobjects.practice;

public class Odometer {
    final double maxMileage = 999.999;
    double mileage;
    double startMileage;
    FuelGauge fuelGauge;


    public Odometer(double mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.startMileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public double currentMileage(){
        return mileage;
    }

    public void addMileage(){
        if(mileage<maxMileage){
            mileage++;
        } else{
            mileage = 0;
        }

        double distance = startMileage-mileage;
        if(distance % 10 == 0){
            fuelGauge.burnFuel();
        }
    }


}
