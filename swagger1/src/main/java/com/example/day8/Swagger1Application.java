package com.example.day8;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "NAVEEN App",
				version = "1.1.7",
				description = "My Sample App",
				contact = @Contact(
						name = "Naveen",
						email = "727721euee053@skcet.ac.in"
						)
				)
		)
public class Swagger1Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger1Application.class, args);
	}

}
