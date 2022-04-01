package io.codelex.javaAdvancedTest.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    List<T> basket = new ArrayList<>(10);
    private int number = 0;

    public void addToBasket(T item) throws BasketFullException {
        if (number == 10) {
            throw new BasketFullException();
        }
        basket.add(item);
        number++;
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (number == 0) {
            throw new BasketEmptyException();
        }
        basket.remove(item);
        number--;
    }

    public int getNumber() {
        return number;
    }

    public static class BasketFullException extends Exception {
        public BasketFullException() {
            super("Full!");
        }
    }

    public static class BasketEmptyException extends Exception {
        public BasketEmptyException() {
            super("Empty!");
        }
    }

}
