package com.epic.ms.currencyservice.client;


import com.epic.ms.currencyservice.bean.ExchangeRate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(value = "currency-rate-service",url = "http://localhost:4040")
@FeignClient(value = "currency-rate-service")
@RibbonClient(value = "currency-rate-service")
public interface CurrencryRateServiceClient {

    @GetMapping("exchangeRate/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}")
    public ExchangeRate getExchangeRate(@PathVariable String fromCurrency,@PathVariable String toCurrency);
}
