package com.L2Code.L2WebAPI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(title = "L2 Web API", version = "1.0", description = "Documentação da API"))
@SpringBootApplication
public class L2WebApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(L2WebApiApplication.class, args);
	}
}
