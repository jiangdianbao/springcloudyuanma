package com.jdb.springcloud.springcloudeurekaclient2.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 16600
 * @date 2020/10/20 21:45
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    @LoadBalanced // 负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
