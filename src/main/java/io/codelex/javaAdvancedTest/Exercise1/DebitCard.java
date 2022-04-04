package io.codelex.javaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(int number, String owner, String cvv, BigDecimal balance) {
        super(number, owner, cvv, balance);
    }

    @Override
    public void takeOutMoney(BigDecimal money) throws NotEnoughFundsException {
        super.takeOutMoney(money);
        if (getBalance().compareTo(new BigDecimal(100)) < 0) {
            System.out.println(warning());
        }
    }

    @Override
    String warning() {
        return "Warning: Low funds";
    }
}
