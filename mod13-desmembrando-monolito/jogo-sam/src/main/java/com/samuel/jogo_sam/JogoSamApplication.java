package com.samuel.jogo_sam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.samuel.jogo_sam.repositories")
@EnableFeignClients(basePackages = "com.samuel.jogo_sam.feign")
public class JogoSamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JogoSamApplication.class, args);
	}

}
