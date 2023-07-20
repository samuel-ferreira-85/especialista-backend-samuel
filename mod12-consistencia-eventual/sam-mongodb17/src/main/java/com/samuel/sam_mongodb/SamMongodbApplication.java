package com.samuel.sam_mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SamMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamMongodbApplication.class, args);
	}

}
