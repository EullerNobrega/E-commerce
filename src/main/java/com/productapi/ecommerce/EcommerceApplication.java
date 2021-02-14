package com.productapi.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.productapi.ecommerce")
@EntityScan(basePackages = "com.productapi.ecommerce.model.*")
public class EcommerceApplication{
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
