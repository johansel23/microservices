package com.tutorial.gatewayservice.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.*;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.ObjectInputFilter;


@Component
public class AuthFilter extends AbstractGatewayFilterFactory<AuthFilter.config> {

    private WebClient.Builder webClient;

    public AuthFilter(WebClient.Builder webClient) {
        super();
        this.webClient = webClient;
    }

    @Override
    public GatewayFilter apply(config config) {
        return null;
    }

    public static class config{}
}
