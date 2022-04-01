package io.codelex.oop.generics;

public class Combiner<T, U> {

    private T first;
    private U second;

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public String combineTwoItems(T first, U second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
