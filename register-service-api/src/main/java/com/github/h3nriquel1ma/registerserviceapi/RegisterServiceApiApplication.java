package com.github.h3nriquel1ma.registerserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.github.h3nriquel1ma"}, proxyBeanMethods = false)
@EnableJpaRepositories(basePackages = {"com.github.h3nriquel1ma.registerservicecore.Repositories"})
@EntityScan(basePackages = "com.github.h3nriquel1ma.registerservicecore.Models")
public class RegisterServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServiceApiApplication.class, args);
	}

}
