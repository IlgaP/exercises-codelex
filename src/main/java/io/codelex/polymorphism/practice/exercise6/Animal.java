package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeight;
    protected Integer foodEaten;

    public Animal(String animalName, String animalType, double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public Animal(String animalName, double animalWeight) {

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food, int quantity);

    @Override
    public String toString() {
        String result = "(AnimalName): " + animalName;
        result += "(animalWeight): " + animalWeight;
        result += "(food): " + foodEaten;
        return result;
    }

}
