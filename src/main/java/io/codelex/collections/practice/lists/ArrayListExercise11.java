package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> list = new ArrayList<>();

        //TODO: Add 10 values to list
        list.add("Apple");
        list.add("Grapefruit");
        list.add("Avocado");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orange");
        list.add("Kiwi");
        list.add("Pear");
        list.add("Mango");
        list.add("Lemon");


        //TODO: Add new value at 5th position
        list.set(4, "Pear");

        //TODO: Change value at last position (Calculate last position programmatically)
        list.set(list.size() - 1, "Lychee");

        //TODO: Sort your list in alphabetical order
        Collections.sort(list);
        System.out.println(list);

        //TODO: Check if your list contains "Foobar" element
        if (list.contains("Foobar")) {
            System.out.println("contains!");
        } else {
            System.out.println("Not found!");
        }

        //TODO: Print each element of list using loop
        for (String element : list
        ) {
            System.out.println(element);
        }
    }

}
