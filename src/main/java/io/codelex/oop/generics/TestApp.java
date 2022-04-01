package io.codelex.oop.generics;

import java.math.BigDecimal;

public class TestApp {
    public static void main(String[] args) {
        Combiner combiner = new Combiner();


        int number = 10;
        BigDecimal number2 = new BigDecimal(123);
        String text = "Hello";

        String result = combiner.combineTwoItems(number, number2);
        System.out.println(result);


        Printer printer = new Printer<>(number);
        printer.print();
        System.out.println(printer.getThingToPrint());

        StorageHouse storageHouse = new StorageHouse<>(number2);
        storageHouse.addMoreItems(text);
        System.out.println(storageHouse.getMaybeFirstItem());
        storageHouse.printItems();
    }
}
