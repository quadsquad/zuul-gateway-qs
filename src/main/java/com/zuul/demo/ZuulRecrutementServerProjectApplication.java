package com.zuul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
public class ZuulRecrutementServerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRecrutementServerProjectApplication.class, args);
	}

}
