package io.codelex.javaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(int number, String owner, String cvv, BigDecimal balance) {
        super(number, owner, cvv, balance);
    }

    @Override
    public void addMoney(BigDecimal money) {
        if (getBalance().compareTo(new BigDecimal(10000)) > 0) {
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
