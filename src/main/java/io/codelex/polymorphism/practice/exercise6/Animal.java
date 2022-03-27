package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private Integer foodEaten;

    public abstract void makeSound();

    public abstract void eat(Food food, int quantity);

}
