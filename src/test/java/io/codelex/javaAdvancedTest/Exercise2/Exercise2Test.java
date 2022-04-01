package io.codelex.javaAdvancedTest.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2Test {

    @Test
    void testBasketWithOneApple() throws Basket.BasketFullException {
        Basket<Apple> basket = new Basket<>();
        Apple apple = new Apple();
        basket.addToBasket(apple);

        int expectedNumber = 1;

        Assertions.assertEquals(expectedNumber, basket.getNumber());
    }

    @Test
    void testBasketWithTwoMushrooms() throws Basket.BasketFullException {
        Basket<Mushroom> basket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        basket.addToBasket(mushroom);
        basket.addToBasket(mushroom);

        int expectedNumber = 2;

        Assertions.assertEquals(expectedNumber, basket.getNumber());
    }

    @Test
    void testException() throws Basket.BasketEmptyException {
        Basket<Mushroom> basket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        basket.removeFromBasket(mushroom);

        //Exception e = Assertions.assertThrows(Exception.class, );
    }

}
