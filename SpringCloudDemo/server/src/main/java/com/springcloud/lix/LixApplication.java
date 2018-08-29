package com.springcloud.lix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class} /* 忽略数据源加载*/)
public class LixApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixApplication.class, args);
    }
}
