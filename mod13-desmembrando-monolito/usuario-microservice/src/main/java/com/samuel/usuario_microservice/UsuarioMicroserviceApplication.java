package com.samuel.usuario_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.samuel.usuario_microservice.repositories")
public class UsuarioMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioMicroserviceApplication.class, args);
	}

}
