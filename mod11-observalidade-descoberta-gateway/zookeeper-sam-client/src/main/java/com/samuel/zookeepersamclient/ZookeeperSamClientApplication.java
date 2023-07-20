package com.samuel.zookeepersamclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperSamClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperSamClientApplication.class, args);
	}

}
