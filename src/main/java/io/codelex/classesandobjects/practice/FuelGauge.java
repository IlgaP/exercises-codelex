package io.codelex.classesandobjects.practice;

public class FuelGauge {
    final int maxFuel = 70;
    int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public int currentAmountOfFuel(){
        return fuel;
    }
    public void addFuel(){
        if(fuel<maxFuel){
            fuel++;
        } else{
            System.out.println("Full");
        }
    }

    public void burnFuel(){
        if(fuel>0){
            fuel--;
        } else {
            System.out.println("Out of fuel");
        }
    }

}

