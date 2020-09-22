package com.epic.ms.exchangerate.controller;

import com.epic.ms.exchangerate.bean.ExchangeRate;
import com.epic.ms.exchangerate.config.ExchangeRateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyRateController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeRateConfig exchangeRateConfig;

    @GetMapping(value = "exchangeRate/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}")
    public ExchangeRate rate(@PathVariable String fromCurrency, @PathVariable String toCurrency) {
        BigDecimal exchnageRate = new BigDecimal(Double.parseDouble(environment.getProperty("currency.exchange.rate")));
        return new ExchangeRate(fromCurrency, toCurrency, exchnageRate,exchangeRateConfig.getServerPort());
    }
}
