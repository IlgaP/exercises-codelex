package io.codelex.classesandobjects.practice;

public class FuelGauge {
    public static final int MAX_FUEL = 70;
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public int currentAmountOfFuel() {
        return fuel;
    }

    public void addFuel() {
        if (fuel < MAX_FUEL) {
            fuel++;
        } else {
            System.out.println("Full");
        }
    }

    public void burnFuel() {
        if (fuel > 0) {
            fuel--;
        } else {
            System.out.println("Out of fuel");
        }
    }


}

