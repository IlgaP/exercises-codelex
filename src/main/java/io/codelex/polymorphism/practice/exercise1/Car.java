package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    Integer currentSpeed = 0;

    void speedUp();

    void slowDown();

    default int showCurrentSpeed() {
        return currentSpeed;
    }

    void startEngine();

    String getName();


}
