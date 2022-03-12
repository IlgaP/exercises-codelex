package io.codelex.currencyConverter;

import java.math.BigDecimal;

public class CurrencyRate {

    private String code;
    private BigDecimal rate;

    public CurrencyRate(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }
}
