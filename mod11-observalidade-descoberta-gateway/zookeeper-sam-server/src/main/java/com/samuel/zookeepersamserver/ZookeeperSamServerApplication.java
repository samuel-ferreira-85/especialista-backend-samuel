package com.samuel.zookeepersamserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperSamServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperSamServerApplication.class, args);
	}

}
