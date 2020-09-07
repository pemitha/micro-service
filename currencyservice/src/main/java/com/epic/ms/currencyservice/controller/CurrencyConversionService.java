package com.epic.ms.currencyservice.controller;

import com.epic.ms.currencyservice.bean.ControllerRate;
import com.epic.ms.currencyservice.bean.ExchangeRate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class CurrencyConversionService {

    @GetMapping(value = "conversion/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}/amount/{amount}")
    public ControllerRate rate(@PathVariable String fromCurrency, @PathVariable String toCurrency,@PathVariable BigDecimal amount){

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("fromCurrency",fromCurrency);
        hashMap.put("toCurrency",toCurrency);

        ResponseEntity<ExchangeRate> responseEntity = new RestTemplate().getForEntity("http://localhost:4040/exchangeRate/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}", ExchangeRate.class, hashMap);
        final ExchangeRate body = responseEntity.getBody();
        return  new ControllerRate(fromCurrency,toCurrency,body.getExchangeRate(),(amount.multiply(body.getExchangeRate())));
    }
}
