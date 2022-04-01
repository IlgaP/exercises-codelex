package io.codelex.classWork;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String toString() {
        return name + ", " + price + " EUR, power: " + power + "W";
    }
}


