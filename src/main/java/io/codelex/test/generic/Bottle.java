package io.codelex.test.generic;

public class Bottle<T extends Liquid> {

    private final T contents;

    public Bottle(T contents) {
        this.contents = contents;
    }

    void pourOutContents() {
        System.out.println(contents.getName() + " has been poured out!");
    }

}
