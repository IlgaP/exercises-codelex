package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("pip-pip");
    }


    @Override
    public void eat(Food food, int quantity) {
        if (!(food instanceof Vegetable)) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            foodEaten = quantity;
        }
    }

    @Override
    public String toString() {
        String result = "Mouse ";
        result += super.toString();
        return result;
    }
}
