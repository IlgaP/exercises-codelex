package io.codelex.javaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public abstract class Card {

    private int number;
    private String owner;
    private String cvv;
    private BigDecimal balance;

    public Card(int number, String owner, String cvv, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void addMoney(BigDecimal money) {
        this.balance = balance.add(money);
    }

    public void takeOutMoney(BigDecimal money) throws NotEnoughFundsException {
        if (money.compareTo(balance) > 0) {
            throw new NotEnoughFundsException();
        }
        this.balance = balance.subtract(money);
    }

    abstract String warning();

    public BigDecimal getBalance() {
        return balance;
    }

    public static class NotEnoughFundsException extends Exception {
        public NotEnoughFundsException() {
            super("Not Enough Funds!");
        }
    }
}
