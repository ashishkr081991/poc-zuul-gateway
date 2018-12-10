package com.spring.zuul.poc.one.poczuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PocZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocZuulGatewayApplication.class, args);
	}
}
