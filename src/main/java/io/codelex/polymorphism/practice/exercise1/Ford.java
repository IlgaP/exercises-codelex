package io.codelex.polymorphism.practice.exercise1;

public class Ford implements CarWithNitrousOxideEngine {
    private Integer currentSpeed = 0;
    private String name;

    public Ford(String name) {
        this.name = name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 13;
    }

    @Override
    public void slowDown() {
        currentSpeed += 13;
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
    public String getName() {
        return name;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 20;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }

}
