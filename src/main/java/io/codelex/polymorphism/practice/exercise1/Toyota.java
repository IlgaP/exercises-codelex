package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car {
    private Integer currentSpeed = 0;
    private String name;

    public Toyota(String name) {
        this.name = name;
    }

    public void speedUp() {
        currentSpeed += 15;
    }

    public void slowDown() {
        currentSpeed += 15;
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
        return "Toyota{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
