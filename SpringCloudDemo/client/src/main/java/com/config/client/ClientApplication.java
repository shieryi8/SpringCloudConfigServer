package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @Value("${sex}")
    private String sex;

    @RequestMapping("hello")
    public String test1() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        return "name=" + name + " sex=" + sex + " age=" + age;
    }

}
