package com.jdb.springcloud.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaclientApplication.class, args);
    }

}
