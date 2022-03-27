package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("hae-hae");
    }

    @Override
    public void eat(Food food, int quantity) {
        if (!(food instanceof Vegetable)) {
            System.out.println("Zebras are not eating that type of food!");
        } else {
            food.quantity = quantity;
        }
    }
}
