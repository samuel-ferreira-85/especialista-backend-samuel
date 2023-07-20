package com.samuel.sam_gateway_api.roteamento;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorRotas {

    @Bean
    public RouteLocator minhasRotas(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("sam-get", p -> p
                        .path( "/get")
                        .filters(f -> f.addRequestHeader("Oi", "Sam"))
                        .uri("https://httpbin.org"))
                .route("sam-host", p -> p
                        .host("*.samuel.com")
                        .filters(f -> f.addRequestHeader("Origem", "Site do Sam"))
                        .uri("https://httpbin.org"))
                .build();
    }
}
