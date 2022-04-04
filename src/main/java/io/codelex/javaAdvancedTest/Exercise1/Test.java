package io.codelex.javaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) throws Card.NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(123456, "Ilga Palze", "267", new BigDecimal(250));
        creditCard.addMoney(new BigDecimal(10));
        creditCard.takeOutMoney(new BigDecimal(1000));
    }
}
