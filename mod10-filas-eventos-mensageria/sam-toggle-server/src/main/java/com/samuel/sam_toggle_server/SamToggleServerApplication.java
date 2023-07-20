package com.samuel.sam_toggle_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SamToggleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamToggleServerApplication.class, args);
	}

}
