package com.jdb.springcloud.springcloudeurekaclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 16600
 * @date 2020/10/20 21:45
 */
@RestController
public class MyController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("test2")
    public String test2() {
        // 注意这个url  调用的方式是 通过被调用方的applicationName来调用的，他会从服务列表中获取信息，然后走负载均衡自己找到要调用服务的ip和port
        String otherServerApplicationName = "springcloudeurekaclient";
        String url = "http://" + otherServerApplicationName + "/test1";
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }
}
