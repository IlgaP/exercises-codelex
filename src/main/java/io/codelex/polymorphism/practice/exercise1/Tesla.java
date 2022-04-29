package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;
    private String name;

    public Tesla(String name) {
        this.name = name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed += 20;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "currentSpeed=" + currentSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
