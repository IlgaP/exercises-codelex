package io.codelex.javaAdvancedTest.Exercise1;

public class DebitCard extends Card {

    public DebitCard(int number, String owner, String cvv, double balance) {
        super(number, owner, cvv, balance);
    }

    @Override
    public void takeOutMoney(double money) throws NotEnoughFundsException {
        if (getBalance() < 0) {
            throw new NotEnoughFundsException();
        }
        if (getBalance() < 100 && money < 100) {
            System.out.println(warning());
            super.takeOutMoney(money);
        } else {
            super.takeOutMoney(money);
        }
    }

    @Override
    String warning() {
        return "Warning: Low funds";
    }
}
