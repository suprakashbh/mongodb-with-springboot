package com.demo.ms.rest.ic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class InsertCordinateApplication {
	public static void main(String[] args) {
		SpringApplication.run(InsertCordinateApplication.class, args);
	}
}
