package io.codelex.classWork;

public class FoodItem extends AbstractItem {

    private String bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return name + ", " + price + " EUR, best before: " + bestBefore;
    }

}
