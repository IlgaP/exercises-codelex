package io.codelex.classWork;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return name + ", " + price + " EUR, color: " + color;

    }
}


