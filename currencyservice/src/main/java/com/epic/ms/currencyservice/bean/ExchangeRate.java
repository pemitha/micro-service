package com.epic.ms.currencyservice.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExchangeRate implements Serializable {

 private String fromCurrency;
 private String toCurrency;
 private BigDecimal exchangeRate;

    public ExchangeRate(String fromCurrency, String toCurrency, BigDecimal exchangeRate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeRate = exchangeRate;
    }

    public ExchangeRate() {
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}

