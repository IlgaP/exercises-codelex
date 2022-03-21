package io.codelex.test.generic;

public class GenericMain {

    public static void main(String[] args) {

        Milk milk = new Milk();
        Bottle<Milk> milkBottle = new Bottle<>(milk);
        milkBottle.pourOutContents();

        Water water = new Water();
        Bottle<Water> waterBottle = new Bottle<>(water);
        waterBottle.pourOutContents();

        Bottle<Vodka> vodkaBottle = createBottleWithContents(new Vodka());
        vodkaBottle.pourOutContents();
    }

    public static <T extends Liquid> Bottle<T> createBottleWithContents(T contents) {
        Bottle<T> newBottle = new Bottle<>(contents);
        return newBottle;
    }

}
