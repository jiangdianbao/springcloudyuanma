package com.jdb.springcloud.springcloudeurekaclient.controller;

import com.jdb.springcloud.springcloudeurekaclient.health.MyCustomHealth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 16600
 * @date 2020/10/20 21:22
 */
@RestController
@Slf4j
public class MyController {

    @GetMapping("/test1")
    public String test1() {
        log.info("has into test1 method");
        return "successful";
    }

    @GetMapping("/test2/{status}")
    public String test2(@PathVariable("status") Integer status) {
        if (1 == status) {
            MyCustomHealth.updateHealthStatus(MyCustomHealth.HealthEnum.UP);
        } else {
            MyCustomHealth.updateHealthStatus(MyCustomHealth.HealthEnum.DOWN);
        }
        return "the server status is " + status;

    }
}
