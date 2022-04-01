package io.codelex.javaAdvancedTest.Exercise1;

public class CreditCard extends Card {
    public CreditCard(int number, String owner, String cvv, double balance) {
        super(number, owner, cvv, balance);
    }

    @Override
    public void addMoney(double money) {
        if (money > 10000) {
            System.out.println(warning());
        } else {
            super.addMoney(money);
        }
    }

    @Override
    String warning() {
        return "Warning: Too much money";
    }
}
