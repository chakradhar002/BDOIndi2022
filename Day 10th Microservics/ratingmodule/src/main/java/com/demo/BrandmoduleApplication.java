package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BrandmoduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrandmoduleApplication.class, args);
	}

}
