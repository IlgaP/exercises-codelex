package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private Integer currentSpeed = 0;
    private String name;

    public Audi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed += 10;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
