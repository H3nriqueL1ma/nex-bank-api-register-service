package com.github.h3nriquel1ma.registerserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.github.h3nriquel1ma"})
public class RegisterServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServiceApiApplication.class, args);
	}

}
