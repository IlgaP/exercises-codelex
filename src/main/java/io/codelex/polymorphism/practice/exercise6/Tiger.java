package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    String livingRegion;

    public Tiger(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("Roarrr!!");
    }

    @Override
    public void eat(Food food, int quantity) {
        if (!(food instanceof Meat)) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            foodEaten = quantity;
        }

    }

    @Override
    public String toString() {
        String result = "Tiger ";
        result += super.toString();
        return result;
    }
}
