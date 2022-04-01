package io.codelex.javaAdvancedTest.Exercise1;

public abstract class Card {

    private int number;
    private String owner;
    private String cvv;
    private double balance;
    private double money;

    public Card(int number, String owner, String cvv, double balance) {
        this.number = number;
        this.owner = owner;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void addMoney(double money) {
        this.balance += money;
    }

    public void takeOutMoney(double money) throws NotEnoughFundsException {
        if (money > balance) {
            throw new NotEnoughFundsException();
        }
        this.balance -= money;
    }

    abstract String warning();

    public double getBalance() {
        return balance;
    }

    public static class NotEnoughFundsException extends Exception {
        public NotEnoughFundsException() {
            super("Not Enough Funds!");
        }
    }
}
