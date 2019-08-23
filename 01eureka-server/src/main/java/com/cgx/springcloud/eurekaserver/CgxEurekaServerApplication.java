package com.cgx.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CgxEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgxEurekaServerApplication.class, args);
    }

}
