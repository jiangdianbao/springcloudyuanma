package com.jdb.springcloud.springcloudeurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 16600
 * @date 2020/10/20 21:22
 */
@RestController
public class MyController {

    @GetMapping("/test1")
    public String test1() {
        return "successful";
    }
}
