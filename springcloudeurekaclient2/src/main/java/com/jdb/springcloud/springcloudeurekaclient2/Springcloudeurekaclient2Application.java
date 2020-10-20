package com.jdb.springcloud.springcloudeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springcloudeurekaclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeurekaclient2Application.class, args);
    }

}
