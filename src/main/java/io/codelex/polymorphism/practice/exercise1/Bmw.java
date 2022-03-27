package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private Integer currentSpeed = 0;
    private String name;

    public Bmw(String name) {
        this.name = name;
    }

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed += 12;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
