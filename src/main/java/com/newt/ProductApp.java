package com.newt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableEurekaClient     // If we need to Register with Eureka Server then use this anotation.
@EnableSwagger2
public class ProductApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductApp.class, args);
		
		
	}
	 
}
