package com.samuel.zookeepersamclient;

import com.samuel.zookeepersamclient.client.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @GetMapping("/greeting")
    public String helloWorld() {
        return helloWorldClient.HelloWorld();
    }
}
