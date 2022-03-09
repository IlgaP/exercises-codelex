package io.codelex.classesandobjects.practice;

public class Exercise3Test {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(10);
        System.out.println("Current fuel amount before filling up: "+fuelGauge.currentAmountOfFuel());

        Odometer odometer = new Odometer(0, fuelGauge);

        for(int i = fuelGauge.currentAmountOfFuel(); i< fuelGauge.maxFuel; i++){
            fuelGauge.addFuel();
        }

        System.out.println("Current fuel amount: "+fuelGauge.currentAmountOfFuel());

        while(fuelGauge.currentAmountOfFuel()>0){
            odometer.addMileage();

            System.out.println("Mileage: "+odometer.currentMileage());
            System.out.println("Fuel: "+ fuelGauge.currentAmountOfFuel());
            System.out.println("-----------------------------");
        }


    }
}
