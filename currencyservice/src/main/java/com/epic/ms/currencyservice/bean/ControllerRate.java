package com.epic.ms.currencyservice.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class ControllerRate implements Serializable {

 private String fromCurrency;
 private String toCurrency;
 private BigDecimal exchangeRate;
 private BigDecimal amount;

    public ControllerRate() {
    }

    public ControllerRate(String fromCurrency, String toCurrency, BigDecimal exchangeRate, BigDecimal amount) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeRate = exchangeRate;
        this.amount = amount;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

