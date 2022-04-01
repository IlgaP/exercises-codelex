package io.codelex.javaAdvancedTest.Exercise1;

public class Test {
    public static void main(String[] args) throws Card.NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(123456, "Ilga Palze", "267", 250);
        creditCard.addMoney(10);
        creditCard.takeOutMoney(1000);
    }
}
