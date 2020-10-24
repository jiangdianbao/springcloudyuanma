package com.jdb.springcloud.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.jdb.springcloud.springcloudeurekaclient.ribbon.config.client.*"))
public class SpringcloudeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaclientApplication.class, args);
    }

}
