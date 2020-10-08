package com.epic.ms.gateway.API_GATEWAY.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Log4j2
public class ApiGatewayFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        log.info("Request Info Request -->{} Request URI -> {}",request,request.getRequestURI());
        return null;
    }
}
