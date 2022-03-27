package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("squeak");
    }


    @Override
    public void eat(Food food, int quantity) {
        if (!(food instanceof Vegetable)) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            food.quantity = quantity;
        }
    }
}
