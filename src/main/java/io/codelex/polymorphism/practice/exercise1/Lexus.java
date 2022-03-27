package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements CarWithNitrousOxideEngine {
    private Integer currentSpeed = 0;
    private String name;

    public Lexus(String name) {
        this.name = name;
    }

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
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
        return "Lexus{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
