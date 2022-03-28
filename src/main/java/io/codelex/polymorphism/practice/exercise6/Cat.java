package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    protected String breed;

    public Cat(String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("meow-meow");
    }

    @Override
    public void eat(Food food, int quantity) {
        food.quantity = quantity;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        String result = "Cat [";
        result += super.toString();
        result += " " + breed + " ]";
        return result;
    }
}
