package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        String animal = "";
        while (!animal.equals("End")) {
            animal = input.nextLine();
            String[] animalInfo = animal.split(" ");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];
            String catBreed = "";
            if (animalInfo.length == 5 || animalType.equals("Cat")) {
                catBreed = animalInfo[4];
            }

            if (animalType.equals("Mouse")) {
                Mouse mouse = new Mouse(animalName, animalWeight, animalLivingRegion);
                mouse.makeSound();
                feed(input, mouse);
                animals.add(mouse);
            }
            if (animalType.equals("Cat")) {
                Cat cat = new Cat(animalName, animalWeight, animalLivingRegion, catBreed);
                cat.makeSound();
                feed(input, cat);
                animals.add(cat);
            }
            if (animalType.equals("Tiger")) {
                Tiger tiger = new Tiger(animalName, animalWeight, animalLivingRegion);
                tiger.makeSound();
                feed(input, tiger);
                animals.add(tiger);
            }
            if (animalType.equals("Zebra")) {
                Zebra zebra = new Zebra(animalName, animalWeight, animalLivingRegion);
                zebra.makeSound();
                feed(input, zebra);
                animals.add(zebra);
            }

            System.out.println(animals);
        }
    }

    private static void feed(Scanner input, Animal animal) {
        String foodInput = input.nextLine();
        String[] foodInfo = foodInput.split(" ");
        String foodType = foodInfo[0];
        int foodQuantity = Integer.parseInt(foodInfo[1]);
        if (foodType.equals("Vegetable")) {
            Vegetable vegetable = new Vegetable(foodQuantity);
            animal.eat(vegetable, foodQuantity);
        } else {
            Meat meat = new Meat(foodQuantity);
            animal.eat(meat, foodQuantity);
        }
    }
}
