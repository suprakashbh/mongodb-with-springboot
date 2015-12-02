package com.demo.ms.rest.ic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class FetchCordinateApplication {
	public static void main(String[] args) {
		SpringApplication.run(FetchCordinateApplication.class, args);
		
		
		
	}
}
