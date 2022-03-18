package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog dogMax = new Dog("Max", Gender.MALE);
        Dog dogRocky = new Dog("Rocky", Gender.MALE);
        Dog dogSparky = new Dog("Sparky", Gender.MALE);
        Dog dogBuster = new Dog("Buster", Gender.MALE);
        Dog dogSam = new Dog("Sam", Gender.MALE);
        Dog dogLady = new Dog("Lady", Gender.FEMALE);
        Dog dogMolly = new Dog("Molly", Gender.FEMALE);
        Dog dogCoco = new Dog("Coco", Gender.FEMALE);

        System.out.println(dogMax);

        dogMax.setMother(dogLady);
        dogMax.setFather(dogRocky);

        dogCoco.setMother(dogMolly);
        dogCoco.setFather(dogBuster);

        dogRocky.setMother(dogMolly);
        dogRocky.setFather(dogSam);

        dogBuster.setMother(dogLady);
        dogBuster.setFather(dogSparky);

        System.out.println(dogCoco.fathersName());
        System.out.println(dogSparky.fathersName());

        System.out.println(dogCoco.hasSameMotherAs(dogRocky));
    }
}
