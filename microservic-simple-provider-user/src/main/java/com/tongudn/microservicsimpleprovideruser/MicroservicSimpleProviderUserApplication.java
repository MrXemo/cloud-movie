package com.tongudn.microservicsimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicSimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicSimpleProviderUserApplication.class, args);
    }
}
