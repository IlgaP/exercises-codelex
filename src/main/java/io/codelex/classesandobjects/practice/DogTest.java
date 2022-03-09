package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog dogMax = new Dog("Max", "male");
        Dog dogRocky = new Dog("Rocky","male");
        Dog dogSparky = new Dog("Sparky", "male");
        Dog dogBuster = new Dog("Buster", "male");
        Dog dogSam = new Dog("Sam", "male");
        Dog dogLady = new Dog("Lady", "female");
        Dog dogMolly = new Dog("Molly", "female");
        Dog dogCoco = new Dog("Coco", "female");

        System.out.println(dogMax);

        dogMax.mother = dogLady;
        dogMax.father = dogRocky;

        dogCoco.mother = dogMolly;
        dogCoco.father = dogBuster;

        dogRocky.mother = dogMolly;
        dogRocky.father = dogSam;

        dogBuster.mother = dogLady;
        dogBuster.father = dogSparky;

        System.out.println(dogCoco.fathersName());
        System.out.println(dogSparky.fathersName());

        System.out.println(dogCoco.hasSameMotherAs(dogRocky));
    }
}
