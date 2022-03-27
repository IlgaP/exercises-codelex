package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private int dimensions;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, int dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + numberOfCopies * costPerCopy;
    }

    public String toString() {
        return super.toString() + " Poster: Number of copies=" + numberOfCopies + " Cost per copy=" + costPerCopy;
    }
}
