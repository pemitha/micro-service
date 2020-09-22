package com.epic.ms.currencyservice.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExchangeRate implements Serializable {

 private String fromCurrency;
 private String toCurrency;
 private BigDecimal exchangeRate;
 private int Port;

    public ExchangeRate(String fromCurrency, String toCurrency, BigDecimal exchangeRate, int port) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeRate = exchangeRate;
        Port = port;
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

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }
}

