package com.samuel.zookeepersamclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class HelloWorldClient {

    @Autowired
    private HWClient hwClient;
    @FeignClient(name = "HelloWorld")
    interface HWClient {

        @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
        String helloWorld();
    }

    public String HelloWorld() {
        return hwClient.helloWorld();
    }
}
