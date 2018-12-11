package com.ronaldarias.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ronaldarias.apirest.models.service.PrestamosService")
public class DemoApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApirestApplication.class, args);
	}
}
