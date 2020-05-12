package com.rq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfClientApplication.class, args);
		System.out.println("Config client run success.");
	}
}
