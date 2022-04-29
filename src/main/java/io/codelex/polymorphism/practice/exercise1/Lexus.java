package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements CarWithNitrousOxideEngine {
    private Integer currentSpeed = 0;
    private String name;

    public Lexus(String name) {
        this.name = name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed += 8;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
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
    public String toString() {
        return "Lexus{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
