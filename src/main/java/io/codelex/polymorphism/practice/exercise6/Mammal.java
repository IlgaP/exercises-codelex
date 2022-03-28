package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {

    protected String livingRegion;

    public Mammal(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " " + livingRegion;
        return result;
    }
}
